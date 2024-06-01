package com.example.demo.controller;

import com.example.demo.entity.User;
import com.example.demo.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("api/users")
@AllArgsConstructor
public class UserController {
    private final UserService userService;

    @GetMapping
    public List<User> getAllUser() {
        return userService.getAllUser();
    }

    @PostMapping
    public void addUser(@RequestBody User user) {
        userService.createUser(user);
    }

    @GetMapping
    @RequestMapping("byId/{id}")
    public Optional<User> getUserById(@PathVariable String id) {
     return userService.getUserById(id);
    }
    @GetMapping
    @RequestMapping("byEmail/{email}")
    public Optional <User> getUserByEmail(@PathVariable String email){
        return userService.getUserByEmail(email);
    }
    @DeleteMapping("/{id}")
    public void deletedUser(@PathVariable String id){
        userService.deletedUser(id);
    }
}
