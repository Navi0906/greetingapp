package com.bridgelabz.greetingapp.controller;

import com.bridgelabz.greetingapp.model.Greeting;
//import com.bridgelabz.greetingapp.model.User;
import com.bridgelabz.greetingapp.model.UserInfo;
import com.bridgelabz.greetingapp.service.GreetingServiceImpl;
import com.bridgelabz.greetingapp.service.IGreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController implements IGreetingService {

    @Autowired
    private IGreetingService service;

//    public Greeting greeting(@RequestParam(value = "name", defaultValue="World") String name){
//        UserInfo user = new UserInfo();
//        user.setFirstName(name);
//        return GreetingServiceImpl.addGreeting(user);
//    }
}
