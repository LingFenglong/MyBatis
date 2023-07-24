package com.lingfenglong.mybatis.test;

import com.lingfenglong.mybatis.mappers.EmpMapper;
import com.lingfenglong.mybatis.utils.SqlSessionUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

public class ResultMapTest {
    @Test
    public void testGetAllEmp() {
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        EmpMapper mapper = sqlSession.getMapper(EmpMapper.class);

        mapper.getAllEmp().forEach(System.out::println);

        sqlSession.close();
    }

    @Test
    public void testGetEmpAndDept() {
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        EmpMapper mapper = sqlSession.getMapper(EmpMapper.class);

        System.out.println(mapper.getEmpAndDept(3));

        sqlSession.close();
    }

    @Test
    public void testGetEmpAndDeptByStep() {
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        EmpMapper mapper = sqlSession.getMapper(EmpMapper.class);

        System.out.println(mapper.getEmpAndDeptByStepOne(2));

        sqlSession.close();
    }
}