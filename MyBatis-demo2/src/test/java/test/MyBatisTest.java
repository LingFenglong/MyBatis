package test;

import com.lingfenglong.mybatis.mappers.ParameterMapper;
import com.lingfenglong.mybatis.pojo.User;
import com.lingfenglong.mybatis.utils.SqlSessionUtils;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.Map;

public class MyBatisTest {

    @Test
    public void testGetAllUser() {
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        ParameterMapper mapper = sqlSession.getMapper(ParameterMapper.class);
        mapper.getAllUser().forEach(System.out::println);

        sqlSession.close();
    }

    @Test
    public void testGetUserByUsername() {
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        ParameterMapper mapper = sqlSession.getMapper(ParameterMapper.class);
        System.out.println(mapper.getUserByUsername("zhangsan"));

        sqlSession.close();
    }

    @Test
    public void testCheckLogin() {
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        ParameterMapper mapper = sqlSession.getMapper(ParameterMapper.class);
        System.out.println(mapper.checkLogin("zhangsan", "123456"));

        sqlSession.close();
    }

    @Test
    public void testCheckLoginByMap() {
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        ParameterMapper mapper = sqlSession.getMapper(ParameterMapper.class);
        System.out.println(mapper.checkLoginByMap(
                Map.of("username", "zhangsan", "password","123456")
        ));

        sqlSession.close();
    }

    @Test
    public void testCheckLoginByParam() {
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        ParameterMapper mapper = sqlSession.getMapper(ParameterMapper.class);
        System.out.println(mapper.checkLoginByParam("lisi", "123456"));

        sqlSession.close();
    }

    @Test
    public void testInsertUser() {
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        ParameterMapper mapper = sqlSession.getMapper(ParameterMapper.class);
        System.out.println(mapper.insertUser(new User(null, "lisi", "123456", 19, "男", "789@qq.com")));

        sqlSession.close();
    }
}
