package com.microservices.grpc.order_product.services;

import com.microservices.grpc.order_product.entities.ProductEntity;
import com.microservices.grpc.order_product.dto.GetProductByIdRequest;
import com.microservices.grpc.order_product.dto.GetProductByIdResponse;
import com.microservices.grpc.order_product.dto.UpdateProductRequest;
import com.microservices.grpc.order_product.dto.UpdateProductResponse;
import com.microservices.grpc.order_product.entities.Product;
import com.microservices.grpc.order_product.entities.ProductState;
import com.microservices.grpc.order_product.services.ProductServiceGrpc;
import com.microservices.grpc.order_product.repositories.ProductRepository;
import io.grpc.stub.StreamObserver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductServiceImpl extends ProductServiceGrpc.ProductServiceImplBase {

    private static final Logger logger = LoggerFactory.getLogger(ProductServiceImpl.class);

    @Autowired
    private ProductRepository productRepository;

    @Override
    public void getProductById(GetProductByIdRequest request, StreamObserver<GetProductByIdResponse> responseObserver) {
        logger.info("Received product retrieval request for ID: {}", request.getProductId());

        try {
            ProductEntity productEntity = productRepository.findById(request.getProductId())
                    .orElseThrow(() -> new RuntimeException("Product not found: " + request.getProductId()));

            Product product = Product.newBuilder()
                    .setId(productEntity.getId())
                    .setQuantity(productEntity.getQuantity())
                    .setState(ProductState.valueOf(productEntity.getState()))
                    .build();

            GetProductByIdResponse response = GetProductByIdResponse.newBuilder()
                    .setProduct(product)
                    .build();

            logger.info("Product found: ID={}, quantity={}, state={}",
                    productEntity.getId(), productEntity.getQuantity(), productEntity.getState());

            responseObserver.onNext(response);
            responseObserver.onCompleted();

        } catch (Exception e) {
            logger.error("Error retrieving product", e);
            responseObserver.onError(e);
        }
    }

    @Override
    public void updateProduct(UpdateProductRequest request, StreamObserver<UpdateProductResponse> responseObserver) {
        logger.info("Received product update request for ID: {}", request.getProduct().getId());

        try {
            // Find the product
            ProductEntity productEntity = productRepository.findById(request.getProduct().getId())
                    .orElseThrow(() -> new RuntimeException("Product not found: " + request.getProduct().getId()));

            // Update the product
            productEntity.setQuantity(request.getProduct().getQuantity());
            productEntity.setState(request.getProduct().getState().name());

            // Save the updated product
            productEntity = productRepository.save(productEntity);
            logger.info("Product updated successfully");

            // Create the response
            UpdateProductResponse response = UpdateProductResponse.newBuilder()
                    .setSuccess(true)
                    .setMessage("Product updated successfully")
                    .build();

            responseObserver.onNext(response);
            responseObserver.onCompleted();

        } catch (Exception e) {
            logger.error("Error updating product", e);

            UpdateProductResponse response = UpdateProductResponse.newBuilder()
                    .setSuccess(false)
                    .setMessage("Error updating product: " + e.getMessage())
                    .build();

            responseObserver.onNext(response);
            responseObserver.onCompleted();
        }
    }
}
