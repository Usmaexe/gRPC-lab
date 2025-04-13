package com.microservices.grpc.order_product.config;

import com.microservices.grpc.order_product.services.OrderServiceImpl;
import com.microservices.grpc.order_product.services.ProductServiceImpl;
import io.grpc.Server;
import io.grpc.ServerBuilder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.io.IOException;

@Configuration
public class GrpcServerConfig {

    private static final Logger logger = LoggerFactory.getLogger(GrpcServerConfig.class);

    @Value("${order.service.port:9090}")
    private int orderServicePort;

    @Value("${product.service.port:9091}")
    private int productServicePort;

    @Autowired
    private OrderServiceImpl orderService;

    @Autowired
    private ProductServiceImpl productService;

    @Bean
    public Server orderServiceServer() throws IOException {
        Server server = ServerBuilder.forPort(orderServicePort)
                .addService(orderService)
                .build();

        server.start();
        logger.info("Order Service gRPC server started on port {}", orderServicePort);

        Runtime.getRuntime().addShutdownHook(new Thread(() -> {
            logger.info("Shutting down Order Service gRPC server");
            server.shutdown();
        }));

        return server;
    }

    @Bean
    public Server productServiceServer() throws IOException {
        Server server = ServerBuilder.forPort(productServicePort)
                .addService(productService)
                .build();

        server.start();
        logger.info("Product Service gRPC server started on port {}", productServicePort);

        Runtime.getRuntime().addShutdownHook(new Thread(() -> {
            logger.info("Shutting down Product Service gRPC server");
            server.shutdown();
        }));

        return server;
    }
}
