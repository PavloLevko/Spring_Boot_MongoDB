package com.example.demo.service;

import com.example.demo.dto.UserDto;
import com.example.demo.entity.User;
import com.example.demo.exception.ApiException;
import com.example.demo.exception.UserNotFoundException;
import com.example.demo.repository.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class UserService {
    private final UserRepository userRepository;

    public List<UserDto> getAllUser() {
        return userRepository.findAll();
    }

    public void createUser(UserDto user) {
        userRepository.insert(user);
    }

    public Optional<UserDto> getUserById(String id) {
        return Optional.ofNullable(userRepository.findById(id)
                .orElseThrow(() -> new UserNotFoundException("User Not Found with id: " + id)));
    }

    public Optional<UserDto> getUserByEmail(String email) {
        return userRepository.findUserByEmail(email);
    }
    public void deletedUser(String id){
        userRepository.deleteById(id);
    }

    public List<UserDto> getUsersByCity(String city) {
       return userRepository.findByAddressCity(city);
    }
    public List<UserDto> getUserAfterInputTime(LocalDateTime time){
        return userRepository.findByCreatedAfter(time);
    }
}
