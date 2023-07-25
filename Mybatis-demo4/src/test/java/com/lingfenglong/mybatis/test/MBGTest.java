package com.lingfenglong.mybatis.test;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.github.pagehelper.PageInterceptor;
import com.lingfenglong.mybatis.mappers.DepartmentMapper;
import com.lingfenglong.mybatis.mappers.EmployeeMapper;
import com.lingfenglong.mybatis.pojo.Employee;
import com.lingfenglong.mybatis.pojo.EmployeeExample;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class MBGTest {
    @Test
    public void testMBG() throws IOException {
        InputStream is = Resources.getResourceAsStream("mybatis-config.xml");
        SqlSession sqlSession = new SqlSessionFactoryBuilder().build(is).openSession(true);
        EmployeeMapper employeeMapper = sqlSession.getMapper(EmployeeMapper.class);
        DepartmentMapper departmentMapper = sqlSession.getMapper(DepartmentMapper.class);

        // 查询所有数据
        System.out.println(employeeMapper.selectByExample(null));
        System.out.println(departmentMapper.selectByExample(null));

        // 所有名字中没有 x 的员工
        EmployeeExample employeeExample = new EmployeeExample();
        employeeExample.createCriteria().andEmpNameNotLike("%x%").andDidIsNotNull();
        employeeMapper.selectByExample(employeeExample).forEach(System.out::println);
    }

    @Test
    public void testPageHelper() throws IOException {
        InputStream is = Resources.getResourceAsStream("mybatis-config.xml");
        SqlSession sqlSession = new SqlSessionFactoryBuilder().build(is).openSession(true);
        EmployeeMapper employeeMapper = sqlSession.getMapper(EmployeeMapper.class);
        DepartmentMapper departmentMapper = sqlSession.getMapper(DepartmentMapper.class);

        int pageNum = 1;
        System.out.println("第" + pageNum + "页");

        PageHelper.startPage(pageNum, 3);
        List<Employee> employees = employeeMapper.selectByExample(null);
        employees.forEach(System.out::println);

        PageInfo<Employee> info = PageInfo.of(employees);
        System.out.print("选择页码: ");
        if (!info.isIsFirstPage()) {
            System.out.print("首页  ");
        }
        if (info.isHasPreviousPage()) {
            System.out.print(info.getPrePage() + "  ");
        }
        System.out.print(info.getPageNum() + "  ");
        if (info.isHasNextPage()) {
            System.out.print(info.getNextPage() + "  ");
        }
        if (!info.isIsLastPage()) {
            System.out.print("尾页  ");
        }
    }
}
