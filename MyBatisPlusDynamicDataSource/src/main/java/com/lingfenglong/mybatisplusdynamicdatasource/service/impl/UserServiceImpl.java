package com.lingfenglong.mybatisplusdynamicdatasource.service.impl;

import com.baomidou.dynamic.datasource.annotation.DS;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.lingfenglong.mybatisplusdynamicdatasource.mapper.UserMapper;
import com.lingfenglong.mybatisplusdynamicdatasource.pojo.User;
import com.lingfenglong.mybatisplusdynamicdatasource.service.UserService;
import org.springframework.stereotype.Service;

@Service
@DS("master")
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {
}
