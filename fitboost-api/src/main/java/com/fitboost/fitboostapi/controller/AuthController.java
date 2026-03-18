package com.fitboost.fitboostapi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.fitboost.fitboostapi.model.User;
import com.fitboost.fitboostapi.repository.UserRepository;

@RestController
@RequestMapping("/api")
@CrossOrigin("*")
public class AuthController {

    @Autowired
    private UserRepository userRepository;

    @PostMapping("/register")
    public User registerUser(@RequestBody User user){
        return userRepository.save(user);
    }
}