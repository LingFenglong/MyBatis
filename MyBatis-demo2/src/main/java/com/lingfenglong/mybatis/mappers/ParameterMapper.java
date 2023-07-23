package com.lingfenglong.mybatis.mappers;

import com.lingfenglong.mybatis.pojo.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface ParameterMapper {
    List<User> getAllUser();

    User getUserByUsername(String username);

    // 验证登录
    User checkLogin(String username, String password);

    User checkLoginByMap(Map<String, Object> map);

    User checkLoginByParam(@Param("username") String username, @Param("password") String password);

    int insertUser(User user);
}
