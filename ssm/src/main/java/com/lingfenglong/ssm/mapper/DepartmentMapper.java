package com.lingfenglong.ssm.mapper;

import com.lingfenglong.ssm.pojo.Department;
import org.apache.ibatis.annotations.Param;

public interface DepartmentMapper {
    Department getDepartmentById(@Param("departmentId") Integer departmentId);
}
