package com.microservices.grpc.order_product.services;

import com.microservices.grpc.order_product.entities.OrderEntity;
import com.microservices.grpc.order_product.dto.CreateOrderRequest;
import com.microservices.grpc.order_product.dto.CreateOrderResponse;
import com.microservices.grpc.order_product.dto.GetProductByIdRequest;
import com.microservices.grpc.order_product.dto.GetProductByIdResponse;
import com.microservices.grpc.order_product.entities.Order;
import com.microservices.grpc.order_product.entities.OrderState;
import com.microservices.grpc.order_product.entities.Product;
import com.microservices.grpc.order_product.entities.ProductState;
import com.microservices.grpc.order_product.services.OrderServiceGrpc;
import com.microservices.grpc.order_product.services.ProductServiceGrpc;
import com.microservices.grpc.order_product.repositories.OrderRepository;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.stub.StreamObserver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import jakarta.annotation.PostConstruct;

@Service
public class OrderServiceImpl extends OrderServiceGrpc.OrderServiceImplBase {

    private static final Logger logger = LoggerFactory.getLogger(OrderServiceImpl.class);

    @Autowired
    private OrderRepository orderRepository;

    @Value("${product.service.host:localhost}")
    private String productServiceHost;

    @Value("${product.service.port:9091}")
    private int productServicePort;

    private ProductServiceGrpc.ProductServiceBlockingStub productServiceStub;

    @PostConstruct
    public void initialize() {
        logger.info("Initializing connection to Product Service at {}:{}", productServiceHost, productServicePort);
        ManagedChannel channel = ManagedChannelBuilder.forAddress(productServiceHost, productServicePort)
                .usePlaintext()
                .build();
        productServiceStub = ProductServiceGrpc.newBlockingStub(channel);
    }

    @Override
    public void createOrder(CreateOrderRequest request, StreamObserver<CreateOrderResponse> responseObserver) {
        logger.info("Received order creation request for product ID: {}, quantity: {}",
                request.getProductId(), request.getQuantity());

        try {
            // Check product availability
            GetProductByIdRequest productRequest = GetProductByIdRequest.newBuilder()
                    .setProductId(request.getProductId())
                    .build();

            GetProductByIdResponse productResponse = productServiceStub.getProductById(productRequest);
            Product product = productResponse.getProduct();

            OrderEntity orderEntity = new OrderEntity();
            orderEntity.setProductId(request.getProductId());
            orderEntity.setQuantity(request.getQuantity());

            // Check if product is available and has enough quantity
            if (product.getState() == ProductState.AVAILABLE && product.getQuantity() >= request.getQuantity()) {
                orderEntity.setState(OrderState.PROCESSING.name());
                logger.info("Product available. Setting order state to PROCESSING");
            } else {
                orderEntity.setState(OrderState.FAILED.name());
                logger.warn("Product unavailable or insufficient quantity. Setting order state to FAILED");
            }

            // Save the order
            orderEntity = orderRepository.save(orderEntity);
            logger.info("Order saved with ID: {}", orderEntity.getId());

            // Create the response
            Order order = Order.newBuilder()
                    .setId(orderEntity.getId())
                    .setProductId(orderEntity.getProductId())
                    .setQuantity(orderEntity.getQuantity())
                    .setState(OrderState.valueOf(orderEntity.getState()))
                    .build();

            CreateOrderResponse response = CreateOrderResponse.newBuilder()
                    .setOrder(order)
                    .build();

            responseObserver.onNext(response);
            responseObserver.onCompleted();

        } catch (Exception e) {
            logger.error("Error processing order creation", e);
            responseObserver.onError(e);
        }
    }

    @Override
    public void updateOrderStatus(Order request, StreamObserver<Order> responseObserver) {
        logger.info("Received order status update request for order ID: {}, new state: {}",
                request.getId(), request.getState());

        try {
            // Find the order
            OrderEntity orderEntity = orderRepository.findById(request.getId())
                    .orElseThrow(() -> new RuntimeException("Order not found: " + request.getId()));

            // Update the state
            orderEntity.setState(request.getState().name());
            orderEntity = orderRepository.save(orderEntity);
            logger.info("Order status updated successfully");

            // Create the response
            Order updatedOrder = Order.newBuilder()
                    .setId(orderEntity.getId())
                    .setProductId(orderEntity.getProductId())
                    .setQuantity(orderEntity.getQuantity())
                    .setState(OrderState.valueOf(orderEntity.getState()))
                    .build();

            responseObserver.onNext(updatedOrder);
            responseObserver.onCompleted();

        } catch (Exception e) {
            logger.error("Error updating order status", e);
            responseObserver.onError(e);
        }
    }
}
