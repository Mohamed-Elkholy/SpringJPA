package com.example.springjpa.controller;

import com.example.springjpa.entity.Department;
import com.example.springjpa.entity.User;
import com.example.springjpa.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService ;
    @PostMapping("/reg")
    public User saveUser(@RequestBody User user){
        System.out.println(user);
        return userService.saveUser(user);
    }
    @GetMapping(path = "/{id}")
    public User showUser(@PathVariable("id") Long id) {
        return userService.showUser(id);
    }
    @GetMapping()
    public List<User> getAll(){
        return userService.getAll();
    }
}
