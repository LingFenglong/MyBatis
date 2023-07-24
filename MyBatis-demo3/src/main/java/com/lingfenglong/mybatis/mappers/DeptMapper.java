package com.lingfenglong.mybatis.mappers;

import com.lingfenglong.mybatis.pojo.Dept;
import org.apache.ibatis.annotations.Param;

public interface DeptMapper {
    // 分步 第二步
    Dept getEmpAndDeptByStepTwo(@Param("did") Integer did);
}
