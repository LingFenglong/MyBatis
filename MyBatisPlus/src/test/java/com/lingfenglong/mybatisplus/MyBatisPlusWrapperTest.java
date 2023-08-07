package com.lingfenglong.mybatisplus;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.conditions.update.LambdaUpdateWrapper;
import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import com.baomidou.mybatisplus.core.toolkit.StringUtils;
import com.baomidou.mybatisplus.core.toolkit.support.SFunction;
import com.lingfenglong.mybatisplus.mapper.UserMapper;
import com.lingfenglong.mybatisplus.pojo.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;
import java.util.Map;

@SpringBootTest
public class MyBatisPlusWrapperTest {

    @Autowired
    private UserMapper userMapper;

    @Test
    void test01() {
        QueryWrapper<User> queryWrapper = new QueryWrapper<>();
        queryWrapper.like("name", "a")
                    .between("age", 20, 30)
                    .isNotNull("email");


        List<User> users = userMapper.selectList(queryWrapper);
        users.forEach(System.out::println);
    }

    @Test
    void test02() {
        QueryWrapper<User> queryWrapper = new QueryWrapper<>();
        queryWrapper.orderByDesc("age")
                .orderByAsc("id");

        List<User> users = userMapper.selectList(queryWrapper);
        users.forEach(System.out::println);
    }

    @Test
    void test03() {
        QueryWrapper<User> queryWrapper = new QueryWrapper<>();
        queryWrapper.isNull("email");

        int delete = userMapper.delete(queryWrapper);
        System.out.println("delete = " + delete);
    }

    @Test
    void test04() {
        QueryWrapper<User> queryWrapper = new QueryWrapper<>();
        queryWrapper.gt("age", 20)
                .like("name", "a")
                .or()
                .isNull("email")
                .eq("is_deleted", 0);

        User user = new User();
        user.setName("小明");
        user.setEmail("aaa@gmail.com");

        userMapper.update(user, queryWrapper);
    }

    @Test
    void test05() {
        QueryWrapper<User> queryWrapper = new QueryWrapper<>();
        queryWrapper.like("name", "a")
                .and(userQueryWrapper -> userQueryWrapper.gt("age", 20).or().isNull("email"));

        User user = new User();
        user.setName("小红");
        user.setEmail("vvv@163.com");

        int result = userMapper.update(user, queryWrapper);
        System.out.println("result = " + result);
    }

    @Test
    void test06() {
        QueryWrapper<User> queryWrapper = new QueryWrapper<>();
        queryWrapper.select("name", "age", "email");

        List<Map<String, Object>> maps = userMapper.selectMaps(queryWrapper);
        maps.forEach(System.out::println);
    }

    @Test
    void test07() {
        // id <= 100
        QueryWrapper<User> queryWrapper = new QueryWrapper<>();
        // select * from t_user where uid in (select uid from t_user where id <= 100)
        queryWrapper.inSql("uid", "select uid from t_user where uid <= 100");

        List<User> users = userMapper.selectList(queryWrapper);
        users.forEach(System.out::println);
    }

    @Test
    void test08() {
        UpdateWrapper<User> updateWrapper = new UpdateWrapper<>();
        updateWrapper.like("name", "a")
                .and(wrapper -> wrapper.gt("age", 20).or().isNull("email"));
        updateWrapper.set("name", "小黑").set("email", "ppp@gmail.com");

        int result = userMapper.update(null, updateWrapper);
        System.out.println("result = " + result);
    }

    @Test
    void test09() {
        String username = "a";
        Integer ageBegin = null;
        Integer ageEnd = 30;

        QueryWrapper<User> queryWrapper = new QueryWrapper<>();
        if (StringUtils.isNotBlank(username)) {
            queryWrapper.like("name", username);
        }
        if (ageBegin != null) {
            queryWrapper.gt("age", ageBegin);
        }
        if (ageEnd != null) {
            queryWrapper.lt("age", ageEnd);
        }

        List<User> users = userMapper.selectList(queryWrapper);
        users.forEach(System.out::println);
    }

    @Test
    void test10() {
        String username = "a";
        Integer ageBegin = null;
        Integer ageEnd = 30;

        QueryWrapper<User> queryWrapper = new QueryWrapper<>();
        queryWrapper.like(StringUtils.isNotBlank(username), "name", username)
                .ge(ageBegin != null, "age", ageBegin)
                .lt(ageEnd != null, "age", ageEnd);

        List<User> users = userMapper.selectList(queryWrapper);
        users.forEach(System.out::println);
    }

    @Test
    void test11() {
        String username = "a";
        Integer ageBegin = null;
        Integer ageEnd = 30;

        LambdaQueryWrapper<User> queryWrapper = new LambdaQueryWrapper<>();
        queryWrapper.like(StringUtils.isNotBlank(username), User::getName, username)
                .ge(ageBegin != null, User::getAge, ageBegin)
                .le(ageEnd != null, User::getAge, ageEnd);

        List<User> users = userMapper.selectList(queryWrapper);
        users.forEach(System.out::println);
    }

    @Test
    void test12() {
        LambdaUpdateWrapper<User> updateWrapper = new LambdaUpdateWrapper<>();
        updateWrapper.like(User::getName, "a")
                .and(wrapper -> wrapper.gt(User::getAge, 20).or().isNull(User::getEmail));
        updateWrapper.set(User::getName, "小白").set(User::getEmail, "ppp@gmail.com");

        int result = userMapper.update(null, updateWrapper);
        System.out.println("result = " + result);
    }
}
