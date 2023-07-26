package com.lingfenglong.ssm.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.lingfenglong.ssm.mapper.EmployeeMapper;
import com.lingfenglong.ssm.pojo.Employee;
import com.lingfenglong.ssm.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Map;
import java.util.Objects;

@Service
@Transactional
public class EmployeeServiceImpl implements EmployeeService {
    private EmployeeMapper employeeMapper;

    @Autowired
    public EmployeeServiceImpl(EmployeeMapper employeeMapper) {
        this.employeeMapper = employeeMapper;
    }

    @Override
    public List<Employee> getAllEmployee() {
        return employeeMapper.getAllEmployee();
    }

    @Override
    public PageInfo<Employee> getEmployeePage(Integer pageNum) {
        PageHelper.startPage(pageNum, 10);
        List<Employee> employees = employeeMapper.getEmployeePage();
        return new PageInfo<>(employees, 5);
    }

    @Override
    public Employee getEmployeeById(Integer employeeId) {
        return employeeMapper.getEmployeeById(employeeId);
    }

    @Override
    public void deleteEmployeeById(Integer employeeId) {
        employeeMapper.deleteEmployeeById(employeeId);
    }

    @Override
    public void updateEmployee(Employee employee) {
        employeeMapper.updateEmployee(employee);
    }
}
