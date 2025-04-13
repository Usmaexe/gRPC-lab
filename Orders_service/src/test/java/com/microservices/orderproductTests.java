package com.microservices;

import com.microservices.grpc.order_product.orderproduct;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(classes= orderproduct.class)
class orderproductTests {

    @Test
    void contextLoads() {
    }

}
