package com.bridgelabz.greetingapp.controller;

import com.bridgelabz.greetingapp.model.UserInfo;
import com.bridgelabz.greetingapp.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/userinfo")
public class UserController {
    @Autowired
    UserInfoService userInfoService;

    @PostMapping("")
    public String createNewUser(@RequestBody UserInfo user){
        userInfoService.createUser(user);
        return "User Created";
    }
}