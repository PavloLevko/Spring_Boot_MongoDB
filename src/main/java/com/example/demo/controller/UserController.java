package com.example.demo.controller;

import com.example.demo.dto.UserDto;
import com.example.demo.entity.User;
import com.example.demo.exception.UserNotFoundException;
import com.example.demo.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("api/users")
@AllArgsConstructor
public class UserController {
    private final UserService userService;

    @GetMapping
    public List<UserDto> getAllUser() {
        return userService.getAllUser();
    }

    @PostMapping
    public void addUser(@Validated @RequestBody UserDto user) {
        userService.createUser(user);
    }

    @GetMapping("byId/{id}")
    public ResponseEntity <Optional<UserDto>> getUserById(@PathVariable String id) {
        Optional<UserDto> userById = userService.getUserById(id);
        if (userById.isPresent()){
            return new ResponseEntity<>(userById, HttpStatus.FOUND);
        }
        throw new UserNotFoundException("User not found");
    }
    @GetMapping("byEmail/{email}")
    public Optional <UserDto> getUserByEmail(@PathVariable String email){
        return userService.getUserByEmail(email);
    }
    @DeleteMapping("/{id}")
    public void deletedUser(@PathVariable String id){
        userService.deletedUser(id);
    }
    @GetMapping("byCity/{city}")
    public List<UserDto> getUsersByCity(@PathVariable String city){
       return userService.getUsersByCity(city);
    }
    @GetMapping("afterTime/{time}")
    public List<UserDto> getUsersAfterTime(@PathVariable LocalDateTime time){
      return userService.getUserAfterInputTime(time);
    }
}
