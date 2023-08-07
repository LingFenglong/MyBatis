package com.lingfenglong.mybatisplusdynamicdatasource;

import com.lingfenglong.mybatisplusdynamicdatasource.service.ProductService;
import com.lingfenglong.mybatisplusdynamicdatasource.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class MyBatisPlusDynamicDataSourceApplicationTests {

    private UserService userService;
    private ProductService productService;

    @Autowired
    public MyBatisPlusDynamicDataSourceApplicationTests(UserService userService, ProductService productService) {
        this.userService = userService;
        this.productService = productService;
    }

    @Test
    void contextLoads() {
        System.out.println(userService.getById(1));
        System.out.println(productService.getById(1));
    }

}
