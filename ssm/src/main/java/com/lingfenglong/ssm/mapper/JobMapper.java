package com.lingfenglong.ssm.mapper;

import com.lingfenglong.ssm.pojo.Job;
import org.apache.ibatis.annotations.Param;

public interface JobMapper {
    Job getJobById(@Param("jobId") Integer jobId);
}
