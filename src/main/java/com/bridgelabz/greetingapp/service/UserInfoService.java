package com.bridgelabz.greetingapp.service;




import com.bridgelabz.greetingapp.model.UserInfo;

import com.bridgelabz.greetingapp.repository.UserInfoRepository;

//import com.bridgelabz.greetingapp.repository.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;



import java.util.List;

@Service
public class UserInfoService implements IUserInfoService{

    @Autowired
    UserInfoRepository userInfoRepository;

    @Override
    public void createUser(UserInfo userInfo) {

        Long id = userInfo.getId();
        String firstName = userInfo.getFirstName();
        String lastName = userInfo.getLastName();



        UserInfo username = new UserInfo();
        username.setId(id);
        username.setFirstName(firstName);
        username.setLastName(lastName);



        UserInfo savedUser = userInfoRepository.save(username);
    }

    @Override
    public List<UserInfo> getUsers() {
        List<UserInfo> list = userInfoRepository.findAll();
        return list;
    }



}