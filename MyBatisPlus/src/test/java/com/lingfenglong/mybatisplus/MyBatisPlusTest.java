package com.lingfenglong.mybatisplus;

import com.lingfenglong.mybatisplus.mapper.UserMapper;
import com.lingfenglong.mybatisplus.pojo.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;
import java.util.Map;

@SpringBootTest
public class MyBatisPlusTest {
    @Autowired
    private UserMapper userMapper;

    @Test
    public void testSelectList() {
        List<User> users = userMapper.selectList(null);
        users.forEach(System.out::println);
    }

    @Test
    public void testInsert() {
        User user = new User(null, "zhangsan", 18, "aaa.@qq.com");
        int result = userMapper.insert(user);
        System.out.println("result = " + result);
        System.out.println("user.getId() = " + user.getId());
    }

    @Test
    void testDelete() {
//        int result = userMapper.deleteById(101);

//        // 条件 name = “张三” && age = 23
//        int result = userMapper.deleteByMap(Map.of("name", "张三", "age", "23"));

//        // 多个id批量删除
//        int result = userMapper.deleteBatchIds(List.of(1L, 2L, 3L));
//        System.out.println("result = " + result);
    }

    @Test
    void testUpdate() {
        User user = new User(4L, "李四", 23, "lisi@qq.com");
        int result = userMapper.updateById(user);
        System.out.println("result = " + result);
    }

    @Test
    void testSelect() {
//        User user = userMapper.selectById(1L);
//        System.out.println("user = " + user);

//        List<User> users = userMapper.selectBatchIds(List.of(1L, 2L, 3L));
//        users.forEach(System.out::println);

//        List<User> users = userMapper.selectByMap(Map.of("name", "Jack", "age", "20"));
//        users.forEach(System.out::println);

//        List<User> users = userMapper.selectList(null);
//        users.forEach(System.out::println);

        Map<String, Object> user = userMapper.selectMapById(1L);
        user.forEach((k, v) -> System.out.println("k = " + k + "  " + "v = " + v));

    }
}
