package com.lingfenglong.mybatis.test;

import com.lingfenglong.mybatis.mappers.DeptMapper;
import com.lingfenglong.mybatis.mappers.EmpMapper;
import com.lingfenglong.mybatis.utils.SqlSessionUtils;
import org.apache.ibatis.annotations.Mapper;
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

    @Test
    public void testLazyLoadingEnabled() {
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        EmpMapper mapper = sqlSession.getMapper(EmpMapper.class);

//      延迟加载，值查询必要的Sql
        System.out.println(mapper.getEmpAndDeptByStepOne(3).getEmpName());

        System.out.println("------------------------------------------");

        System.out.println(mapper.getEmpAndDeptByStepOne(3).getDept());

        sqlSession.close();
    }

    @Test
    public void testGetDeptAndEmp() {
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        DeptMapper mapper = sqlSession.getMapper(DeptMapper.class);

        System.out.println(mapper.getDeptAndEmp(1));

        sqlSession.close();
    }

    @Test
    public void testGetDeptAndEmpStep() {
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        DeptMapper mapper = sqlSession.getMapper(DeptMapper.class);

        System.out.println(mapper.getDeptAndEmpStep(1).getDeptName());
        System.out.println("------------------------------------------");
        System.out.println(mapper.getDeptAndEmpStep(1).getEmps());

        sqlSession.close();
    }
}