package com.lingfenglong.mybatisplus.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.lingfenglong.mybatisplus.pojo.User;
import org.apache.ibatis.annotations.MapKey;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.Map;

@Mapper
public interface UserMapper extends BaseMapper<User> {

    // 根据用户查询信息位map集合
    @MapKey("id")
    Map<String, Object> selectMapById(@Param("id") Long id);
}
