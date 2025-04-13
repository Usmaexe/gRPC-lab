package com.microservices.grpc.order_product.controllers;

import com.microservices.grpc.order_product.dto.CreateOrderRequest;
import com.microservices.grpc.order_product.dto.CreateOrderResponse;
import com.microservices.grpc.order_product.entities.Order;
import com.microservices.grpc.order_product.services.OrderServiceGrpc;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@RestController
@RequestMapping("/api/orders")
public class OrderController {

    private static final Logger logger = LoggerFactory.getLogger(OrderController.class);

    @Value("${order.service.host:localhost}")
    private String orderServiceHost;

    @Value("${order.service.port:9090}")
    private int orderServicePort;

    private ManagedChannel channel;
    private OrderServiceGrpc.OrderServiceBlockingStub orderServiceStub;

    @PostConstruct
    public void initialize() {
        logger.info("Initializing gRPC channel to Order Service at {}:{}", orderServiceHost, orderServicePort);
        channel = ManagedChannelBuilder.forAddress(orderServiceHost, orderServicePort)
                .usePlaintext()
                .build();
        orderServiceStub = OrderServiceGrpc.newBlockingStub(channel);
    }

    @PreDestroy
    public void cleanup() {
        //maybe it won't work (chouf logs)
        logger.info("Shutting down gRPC channel");
        if (channel != null) {
            channel.shutdown();
        }
    }

    @PostMapping
    public ResponseEntity<OrderResponseDTO> createNewOrder(@RequestBody OrderRequestDTO request) {
        logger.info("Received create order request for product: {}, quantity: {}",
                request.getProductId(), request.getQuantity());

        try {
            CreateOrderRequest grpcRequest = CreateOrderRequest.newBuilder()
                    .setProductId(request.getProductId())
                    .setQuantity(request.getQuantity())
                    .build();

            logger.info("Sending gRPC request to Order Service");
            CreateOrderResponse grpcResponse = orderServiceStub.createOrder(grpcRequest);

            OrderResponseDTO responseDto = OrderResponseDTO.fromGrpcOrder(grpcResponse.getOrder());

            logger.info("Order created successfully with ID: {} and State : CREATED", responseDto.getId());
            return ResponseEntity.status(HttpStatus.CREATED).body(responseDto);
        } catch (Exception e) {
            logger.error("Error creating order", e);
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }

    @PutMapping("/{orderId}/status")
    public ResponseEntity<OrderResponseDTO> updateOrderStatus(@PathVariable int orderId, @RequestBody OrderStatusDTO statusDTO) {
        logger.info("Received update order status request for order: {}, new status: {}",
                orderId, statusDTO.getState());

        try {
            Order orderUpdate = Order.newBuilder()
                    .setId(orderId)
                    .setState(statusDTO.getState())
                    .build();

            logger.info("Sending gRPC update request to Order Service");
            Order updatedOrder = orderServiceStub.updateOrderStatus(orderUpdate);

            logger.info("Order status updated successfully: {}", updatedOrder.getState());
            OrderResponseDTO responseDto = OrderResponseDTO.fromGrpcOrder(updatedOrder);
            return ResponseEntity.ok(responseDto);
        } catch (Exception e) {
            logger.error("Error updating order status", e);
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }

    public static class OrderRequestDTO {
        private int productId;
        private int quantity;

        public OrderRequestDTO() {
        }

        public int getProductId() {
            return productId;
        }

        public void setProductId(int productId) {
            this.productId = productId;
        }

        public int getQuantity() {
            return quantity;
        }

        public void setQuantity(int quantity) {
            this.quantity = quantity;
        }
    }

    public static class OrderResponseDTO {
        private int id;
        private int productId;
        private int quantity;
        private String state;
        private String createdAt;
        private String updatedAt;

        public OrderResponseDTO() {
        }


        public static OrderResponseDTO fromGrpcOrder(Order grpcOrder) {
            OrderResponseDTO dto = new OrderResponseDTO();
            dto.setId(grpcOrder.getId());
            dto.setProductId(grpcOrder.getProductId());
            dto.setQuantity(grpcOrder.getQuantity());
            dto.setState(grpcOrder.getState().name());
            return dto;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public int getProductId() {
            return productId;
        }

        public void setProductId(int productId) {
            this.productId = productId;
        }

        public int getQuantity() {
            return quantity;
        }

        public void setQuantity(int quantity) {
            this.quantity = quantity;
        }

        public String getState() {
            return state;
        }

        public void setState(String state) {
            this.state = state;
        }

        public String getCreatedAt() {
            return createdAt;
        }

        public void setCreatedAt(String createdAt) {
            this.createdAt = createdAt;
        }

        public String getUpdatedAt() {
            return updatedAt;
        }

        public void setUpdatedAt(String updatedAt) {
            this.updatedAt = updatedAt;
        }
    }
    
    public static class OrderStatusDTO {
        private com.microservices.grpc.order_product.entities.OrderState state;

        public OrderStatusDTO() {
        }

        public com.microservices.grpc.order_product.entities.OrderState getState() {
            return state;
        }

        public void setState(com.microservices.grpc.order_product.entities.OrderState state) {
            this.state = state;
        }
    }
}
