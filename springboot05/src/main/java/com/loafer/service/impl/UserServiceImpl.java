package com.loafer.service.impl;

import com.github.pagehelper.Page;
import com.loafer.entity.User;
import com.loafer.mapper.UserMapper;
import com.loafer.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service
public class UserServiceImpl implements UserService {
    @Resource
    private UserMapper userMapper;

    @Override
    public List<User> getUser() {
        return userMapper.getUser();
    }

    @Override
    public Page<User> findAll() {
        return userMapper.findAll();
    }
}
