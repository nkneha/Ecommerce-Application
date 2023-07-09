package com.example.EcommerceAPI.controller;

import com.example.EcommerceAPI.model.User;
import com.example.EcommerceAPI.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @Autowired
    UserService userService;

    @PostMapping("user")
    public String createUser(@RequestBody User user){
        return userService.createUser(user);

    }
    @GetMapping("user")
    public Iterable<User> getAllUser(){
        return userService.getAllUser();
    }
}
