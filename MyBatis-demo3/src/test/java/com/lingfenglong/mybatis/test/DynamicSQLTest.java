package com.lingfenglong.mybatis.test;

import com.lingfenglong.mybatis.mappers.DynamicSQLMapper;
import com.lingfenglong.mybatis.pojo.Emp;
import com.lingfenglong.mybatis.utils.SqlSessionUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class DynamicSQLTest {
    @Test
    public void testGetEmpByCondition() {
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        DynamicSQLMapper mapper = sqlSession.getMapper(DynamicSQLMapper.class);

        System.out.println(mapper.getEmpByCondition(new Emp(null, "张三", 23, "男", "123@qq.com", null)));
    }

    @Test
    public void testGetEmpByChoose() {
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        DynamicSQLMapper mapper = sqlSession.getMapper(DynamicSQLMapper.class);

        System.out.println(mapper.getEmpByChoose(new Emp(null, "张三", 23, "男", "123@qq.com", null)));
    }

    @Test
    public void testDeleteMoreByArray() {
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        DynamicSQLMapper mapper = sqlSession.getMapper(DynamicSQLMapper.class);

        System.out.println(mapper.deleteMoreByArray(new Integer[] {6, 7, 8}));
    }

    @Test
    public void testInsertMoreByList() {
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        DynamicSQLMapper mapper = sqlSession.getMapper(DynamicSQLMapper.class);

        System.out.println(mapper.insertMoreByList(
                List.of(
                        new Emp(null, "xxx", 23, "男", "123@qq.com", null),
                        new Emp(null, "xxx", 23, "男", "123@qq.com", null),
                        new Emp(null, "xxx", 23, "男", "123@qq.com", null),
                        new Emp(null, "xxx", 23, "男", "123@qq.com", null),
                        new Emp(null, "xxx", 23, "男", "123@qq.com", null)
                )
        ));
    }
}
