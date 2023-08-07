package com.lingfenglong.mybatisplus;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.lingfenglong.mybatisplus.enums.Sex;
import com.lingfenglong.mybatisplus.mapper.ProductMapper;
import com.lingfenglong.mybatisplus.mapper.UserMapper;
import com.lingfenglong.mybatisplus.pojo.Product;
import com.lingfenglong.mybatisplus.pojo.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class MyBatisPluginsTest {

    @Autowired
    private UserMapper userMapper;
    @Autowired
    private ProductMapper productMapper;

    @Test
    void testPage() {
        Page<User> page = new Page<>(1, 3);
        Page<User> userPage = userMapper.selectPage(page, null);

        System.out.println(userPage.getRecords());
        System.out.println("userPage.getPages() = " + userPage.getPages());
        System.out.println("userPage.getTotal() = " + userPage.getTotal());
        System.out.println("userPage.getCurrent() = " + userPage.getCurrent());
        System.out.println("userPage.hasNext() = " + userPage.hasNext());
        System.out.println("userPage.hasPrevious() = " + userPage.hasPrevious());
    }

    @Test
    void testPageVo() {
        Page<User> userPage = new Page<>(1, 3);
        userMapper.selectPageVo(userPage, 20);

        System.out.println(userPage.getRecords());
        System.out.println("userPage.getPages() = " + userPage.getPages());
        System.out.println("userPage.getTotal() = " + userPage.getTotal());
        System.out.println("userPage.getCurrent() = " + userPage.getCurrent());
        System.out.println("userPage.hasNext() = " + userPage.hasNext());
        System.out.println("userPage.hasPrevious() = " + userPage.hasPrevious());
    }

    @Test
    void testProduct01() {
        Product productL1 = productMapper.selectById(1);
        System.out.println("productL1.getPrice() = " + productL1.getPrice());

        Product productWang = productMapper.selectById(1);
        System.out.println("productWang.getPrice() = " + productWang.getPrice());

        productL1.setPrice(productL1.getPrice() + 50);
        productMapper.updateById(productL1);

        productWang.setPrice(productWang.getPrice() - 30);
        int result = productMapper.updateById(productWang);
        if (result == 0) {
            Product product = productMapper.selectById(1);
            product.setPrice(product.getPrice() - 30);
            productMapper.updateById(product);
        }

        Product laoBan = productMapper.selectById(1);
        System.out.println("laoBan = " + laoBan);
    }

    @Test
    void test02() {
        User user = new User(null, "zs", 19, "qqq@qq.com", null);
        user.setSex(Sex.FEMALE);
        int result = userMapper.insert(user);

        System.out.println("result = " + result);
    }
}
