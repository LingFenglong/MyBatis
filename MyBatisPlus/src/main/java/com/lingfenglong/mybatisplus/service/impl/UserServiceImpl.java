package com.lingfenglong.mybatisplus.service.impl;

import com.baomidou.dynamic.datasource.annotation.DS;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.lingfenglong.mybatisplus.mapper.UserMapper;
import com.lingfenglong.mybatisplus.pojo.User;
import com.lingfenglong.mybatisplus.service.UserService;
import org.springframework.stereotype.Service;

@DS("master")
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

}
