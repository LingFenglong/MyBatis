package com.lingfenglong.ssm.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.lingfenglong.ssm.mapper.EmployeeMapper;
import com.lingfenglong.ssm.mapper.JobMapper;
import com.lingfenglong.ssm.pojo.Employee;
import com.lingfenglong.ssm.service.EmployeeService;
import com.lingfenglong.ssm.service.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class JobServiceImpl implements JobService {
    private JobMapper jobMapper;

    @Autowired
    public JobServiceImpl(JobMapper jobMapper) {
        this.jobMapper = jobMapper;
    }
}
