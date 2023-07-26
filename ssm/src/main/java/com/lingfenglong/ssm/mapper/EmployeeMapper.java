package com.lingfenglong.ssm.mapper;

import com.lingfenglong.ssm.pojo.Employee;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface EmployeeMapper {
    List<Employee> getAllEmployee();

    List<Employee> getEmployeePage();

    Employee getEmployeeById(@Param("employeeId") Integer employeeId);

    void deleteEmployeeById(@Param("employeeId") Integer employeeId);

    void updateEmployee(@Param("employee") Employee employee);
}