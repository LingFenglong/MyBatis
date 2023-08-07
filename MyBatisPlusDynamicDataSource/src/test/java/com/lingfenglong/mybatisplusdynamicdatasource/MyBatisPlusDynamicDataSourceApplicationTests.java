package com.lingfenglong.mybatisplusdynamicdatasource;

import com.lingfenglong.mybatisplusdynamicdatasource.mapper.ProductMapper;
import com.lingfenglong.mybatisplusdynamicdatasource.mapper.UserMapper;
import com.lingfenglong.mybatisplusdynamicdatasource.service.ProductService;
import com.lingfenglong.mybatisplusdynamicdatasource.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class MyBatisPlusDynamicDataSourceApplicationTests {

//    private UserMapper userMapper;
//    private ProductMapper productMapper;
    private UserService userService;
    private ProductService productService;

//    @Autowired
//    public MyBatisPlusDynamicDataSourceApplicationTests(UserMapper userMapper, ProductMapper productMapper) {
//        this.userMapper = userMapper;
//        this.productMapper = productMapper;
//    }

    @Autowired
    public MyBatisPlusDynamicDataSourceApplicationTests(UserService userService, ProductService productService) {
        this.userService = userService;
        this.productService = productService;
    }

    @Test
    void contextLoads() {
        System.out.println(userService.getById(1));
        System.out.println(productService.getById(1));

//        System.out.println(userMapper.selectById(1));
//        System.out.println(productMapper.selectById(1));
    }

}
