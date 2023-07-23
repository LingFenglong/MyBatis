package com.lingfenglong.mybatis.mappers;

import com.lingfenglong.mybatis.pojo.User;
import org.apache.ibatis.annotations.MapKey;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface SelectMapper {
    // 根据id查询用户信息
    User getUserById(@Param("id") Integer id);

    // 查询所有用户信息
    List<User> getAllUser();

    // 查询用户信息的总记录数
    Integer getCount();

    // 根据id查询用户信息为一个Map集合
    Map<String, Object> getUserByIdToMap(@Param("id") Integer id);

    // 查询所有用户信息为多个Map集合List<Map<String, Object>>
    List<Map<String, Object>> getAllUserToMap();

    // 查询所有用户信息为多个Map集合 <id, Map<String, Object>>
    // 类型可以写为 Map<Integer, Object>
    @MapKey("id")
    Map<Integer, Map<String, Object>> getAllUserToMapById();


}