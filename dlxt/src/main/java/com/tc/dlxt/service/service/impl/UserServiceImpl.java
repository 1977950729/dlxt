package com.tc.dlxt.service.service.impl;

import com.tc.dlxt.entity.User;
import com.tc.dlxt.service.mapper.UserMapper;
import com.tc.dlxt.service.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("com.tc.dlxt.service.service.UserService")
public class UserServiceImpl implements UserService {

    @Resource
    private UserMapper userMapper;

    @Override
    public List<User> findAll() {
        return userMapper.findAll();
    }
}
