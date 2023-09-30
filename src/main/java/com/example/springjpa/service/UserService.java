package com.example.springjpa.service;

import com.example.springjpa.entity.User;
import com.example.springjpa.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserRepo userRepo;

    public User saveUser(User user){
        //System.out.println(user);
        return userRepo.save(user);
    }

    public User showUser(Long id) {
        return userRepo.findById(id).orElseThrow();
    }

    public List<User> getAll() {
        return userRepo.findAll();
    }
}
