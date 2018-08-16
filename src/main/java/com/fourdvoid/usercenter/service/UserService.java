package com.fourdvoid.usercenter.service;

import com.fourdvoid.usercenter.po.User;

import java.util.List;

public interface UserService {
    List<User> getAllUsers();
    User getUserByOpenid(String openid);
    void Add(String openid, String appid, String unionid, String nickname);
}
