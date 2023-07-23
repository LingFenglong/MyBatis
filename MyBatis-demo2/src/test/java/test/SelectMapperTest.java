package test;

import com.lingfenglong.mybatis.mappers.SelectMapper;
import com.lingfenglong.mybatis.utils.SqlSessionUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

public class SelectMapperTest {
    @Test
    public void testGetUserById() {
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        SelectMapper mapper = sqlSession.getMapper(SelectMapper.class);

        System.out.println(mapper.getUserById(19));

        sqlSession.close();
    }

    @Test
    public void testGetAllUser() {
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        SelectMapper mapper = sqlSession.getMapper(SelectMapper.class);

        mapper.getAllUser().forEach(System.out::println);

        sqlSession.close();
    }

    @Test
    public void testGetCount() {
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        SelectMapper mapper = sqlSession.getMapper(SelectMapper.class);

        System.out.println(mapper.getCount());

        sqlSession.close();
    }

    @Test
    public void testGetUserByIdToMap() {
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        SelectMapper mapper = sqlSession.getMapper(SelectMapper.class);

        System.out.println(mapper.getUserByIdToMap(19));

        sqlSession.close();
    }

    @Test
    public void testGetAllUserToMap() {
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        SelectMapper mapper = sqlSession.getMapper(SelectMapper.class);

        mapper.getAllUserToMap().forEach(System.out::println);

        sqlSession.close();
    }

    @Test
    public void testGetAllUserToMapById() {
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        SelectMapper mapper = sqlSession.getMapper(SelectMapper.class);

        mapper.getAllUserToMapById().forEach((k, v) -> System.out.println(k + " --> " + v));

        sqlSession.close();
    }
}
