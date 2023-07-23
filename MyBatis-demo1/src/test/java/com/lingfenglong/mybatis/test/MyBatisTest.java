package com.lingfenglong.mybatis.test;

import com.lingfenglong.mybatis.mappers.UserMapper;
import com.lingfenglong.mybatis.pojo.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class MyBatisTest {

    @Test
    public void testMybatis() throws IOException {
        InputStream is = Resources.getResourceAsStream("mybatis-config.xml");
        SqlSession sqlSession =
                new SqlSessionFactoryBuilder()
                        .build(is)
                        .openSession(true);     // 自动提交

        UserMapper mapper = sqlSession.getMapper(UserMapper.class);

        int result = mapper.insertUser();
        System.out.println("result: " + result);

        sqlSession.close();
    }

    @Test
    public void testUpdateUser() throws IOException {
        InputStream is = Resources.getResourceAsStream("mybatis-config.xml");
        SqlSession sqlSession = new SqlSessionFactoryBuilder().build(is).openSession(true);

        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        mapper.updateUser();

        sqlSession.close();
    }

    @Test
    public void testDeleteUser() throws IOException {
        InputStream is = Resources.getResourceAsStream("mybatis-config.xml");
        SqlSession sqlSession = new SqlSessionFactoryBuilder().build(is).openSession(true);
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);

        mapper.deleteUser();

        sqlSession.close();
    }

    @Test
    public void testSelectUser() throws IOException {
        InputStream is = Resources.getResourceAsStream("mybatis-config.xml");
        SqlSession sqlSession = new SqlSessionFactoryBuilder().build(is).openSession(true);
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);

//        User user = mapper.getUserById();
//        System.out.println(user);

        List<User> users = mapper.getAllUser();
        users.forEach(System.out::println);

        sqlSession.close();
    }
}
