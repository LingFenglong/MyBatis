package test;

import com.lingfenglong.mybatis.mappers.SQLMapper;
import com.lingfenglong.mybatis.pojo.User;
import com.lingfenglong.mybatis.utils.SqlSessionUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

public class SQLMapperTest {
    @Test
    public void testGetUserByNameLike() {
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        SQLMapper mapper = sqlSession.getMapper(SQLMapper.class);

        mapper.getUserByNameLike("sa").forEach(System.out::println);

        sqlSession.close();
    }

    @Test
    public void testDeleteMore() {
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        SQLMapper mapper = sqlSession.getMapper(SQLMapper.class);

        System.out.println(mapper.deleteMore("15,16,17"));

        sqlSession.close();
    }

    @Test
    public void testGetUserByTableName() {
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        SQLMapper mapper = sqlSession.getMapper(SQLMapper.class);

        mapper.getUserByTableName("t_user").forEach(System.out::println);

        sqlSession.close();
    }

    @Test
    public void testInsertUser() {
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        SQLMapper mapper = sqlSession.getMapper(SQLMapper.class);

        User user = new User(null, "wangwu", "123456", 19, "男", "159@qq.com");
        mapper.insertUser(user);
        System.out.println(user);

        sqlSession.close();
    }
}
