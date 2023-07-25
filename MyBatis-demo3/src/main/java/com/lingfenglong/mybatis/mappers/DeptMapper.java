package com.lingfenglong.mybatis.mappers;

import com.lingfenglong.mybatis.pojo.Dept;
import org.apache.ibatis.annotations.Param;

public interface DeptMapper {
    // 分步 第二步
    Dept getEmpAndDeptByStepTwo(@Param("did") Integer did);

    // 部门以及部门所有的员工信息
    Dept getDeptAndEmp(@Param("did") Integer did);

    Dept getDeptAndEmpStep(@Param("did") Integer did);
}
