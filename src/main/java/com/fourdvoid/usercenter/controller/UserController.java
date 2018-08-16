package com.fourdvoid.usercenter.controller;

import com.fourdvoid.usercenter.po.User;
import com.fourdvoid.usercenter.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping("/userList")
    public List<User> getAllUser() {
        return userService.getAllUsers();
    }
}
