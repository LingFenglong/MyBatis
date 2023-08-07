package com.lingfenglong.mybatisplusdynamicdatasource.mapper;

import com.baomidou.dynamic.datasource.annotation.DS;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.lingfenglong.mybatisplusdynamicdatasource.pojo.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
@DS("master")
public interface UserMapper extends BaseMapper<User> {
}
