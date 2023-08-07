package com.lingfenglong.mybatisplus;

import com.lingfenglong.mybatisplus.mapper.UserMapper;
import com.lingfenglong.mybatisplus.service.ProductService;
import com.lingfenglong.mybatisplus.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class DynamicDataSourceTest {

    private UserService userService;
    private ProductService productService;

    @Autowired
    public DynamicDataSourceTest(UserService userService, ProductService productService) {
        this.userService = userService;
        this.productService = productService;
    }

    @Test
    void testDynamicDataSource() {
        System.out.println(userService.getById(1));
        System.out.println(productService.getById(1));
    }
}
