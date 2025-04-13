package com.microservices.grpc.order_product.repositories;

import com.microservices.grpc.order_product.entities.OrderEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OrderRepository extends JpaRepository<OrderEntity, Integer> {
    List<OrderEntity> findByProductId(Integer productId);
    List<OrderEntity> findByState(String state);
}