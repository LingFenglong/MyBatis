package com.lingfenglong.mybatis.mappers;

import com.lingfenglong.mybatis.pojo.Emp;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface EmpMapper {
    List<Emp> getAllEmp();

    // 查询员工以及员工所对应的部门信息
    Emp getEmpAndDept(@Param("eid") Integer eid);

    // 分步查询
    // 1. 查询员工信息
    Emp getEmpAndDeptByStepOne(@Param("eid") Integer eid);
}