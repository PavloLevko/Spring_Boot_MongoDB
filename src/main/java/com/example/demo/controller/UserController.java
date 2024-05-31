package com.example.demo.controller;

import com.example.demo.entity.User;
import com.example.demo.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/users")
@AllArgsConstructor
public class UserController {
    private final UserService userService;
    @GetMapping
public List<User> getAllUser(){
    return userService.getAllUser();
}
@PostMapping
public void addUser(@RequestBody User user) {
userService.createUser(user);
}
}
