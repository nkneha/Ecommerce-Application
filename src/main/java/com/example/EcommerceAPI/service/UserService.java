package com.example.EcommerceAPI.service;

import com.example.EcommerceAPI.model.User;
import com.example.EcommerceAPI.repository.IUserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    IUserRepo iUserRepo;

    public String createUser(User user) {
        iUserRepo.save(user);
        return "user Created";
    }

    public Iterable<User> getAllUser() {
        return iUserRepo.findAll();
    }
}
