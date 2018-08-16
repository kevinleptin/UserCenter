package com.fourdvoid.usercenter.service.impl;

import com.fourdvoid.usercenter.mapper.UserMapper;
import com.fourdvoid.usercenter.po.User;
import com.fourdvoid.usercenter.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public List<User> getAllUsers() {
        return userMapper.getAllUsers();
    }

    @Override
    public User getUserByOpenid(String openid) {
        return userMapper.getByOpenId(openid);
    }

    @Override
    public void Add(String openid, String appid, String unionid, String nickname) {
        userMapper.Add(openid, appid, unionid, nickname);
    }
}
