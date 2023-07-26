package com.lingfenglong.ssm.service;

import com.github.pagehelper.PageInfo;
import com.lingfenglong.ssm.pojo.Employee;

import java.util.List;
import java.util.Map;

public interface EmployeeService {
    List<Employee> getAllEmployee();

    PageInfo<Employee> getEmployeePage(Integer pageNum);

    Employee getEmployeeById(Integer employeeId);

    void deleteEmployeeById(Integer employeeId);

    void updateEmployee(Employee employee);
}
