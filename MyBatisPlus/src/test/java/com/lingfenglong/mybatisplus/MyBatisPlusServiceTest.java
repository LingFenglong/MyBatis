package com.lingfenglong.mybatisplus;

import com.lingfenglong.mybatisplus.pojo.User;
import com.lingfenglong.mybatisplus.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class MyBatisPlusServiceTest {

    @Autowired
    private UserService userService;

    @Test
    void testGetCount() {
        long count = userService.count();
        System.out.println("count = " + count);
    }

    @Test
    void testInsertMore() {
        boolean result = userService.saveBatch(
                List.of(
                        new User(null, "zhangsan", 19, "aaa@qq.com"),
                        new User(null, "lisi", 20, "abc@qq.com"),
                        new User(null, "wangwu", 15, "acb@qq.com")
                )
        );
        System.out.println("result = " + result);
    }
}
