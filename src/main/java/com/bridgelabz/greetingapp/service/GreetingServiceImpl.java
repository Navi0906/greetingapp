package com.bridgelabz.greetingapp.service;

import com.bridgelabz.greetingapp.model.Greeting;
import com.bridgelabz.greetingapp.repository.GreetingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Service
public class GreetingServiceImpl implements IGreetingService{
//    @Autowired
//    private GreetingRepository repository;
//
//    @PostMapping
//    public Greeting addGreeting(@RequestBody Greeting greeting) {
//        return repository.save(greeting);
//    }


}
