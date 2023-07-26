package com.lingfenglong.ssm.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.lingfenglong.ssm.mapper.DepartmentMapper;
import com.lingfenglong.ssm.mapper.EmployeeMapper;
import com.lingfenglong.ssm.pojo.Employee;
import com.lingfenglong.ssm.service.DepartmentService;
import com.lingfenglong.ssm.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class DepartmentServiceImpl implements DepartmentService {
    private DepartmentMapper departmentMapper;

    @Autowired
    public DepartmentServiceImpl(DepartmentMapper departmentMapper) {
        this.departmentMapper = departmentMapper;
    }
}
