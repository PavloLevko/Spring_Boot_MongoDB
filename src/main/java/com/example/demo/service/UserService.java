package com.example.demo.service;

import com.example.demo.entity.User;
import com.example.demo.repository.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class UserService {
    private final UserRepository userRepository;

    public List<User> getAllUser() {
        return userRepository.findAll();
    }

    public void createUser(User user) {
        userRepository.insert(user);
    }

    public Optional<User> getUserById(String id) {
      return userRepository.findById(id);
    }

    public Optional<User> getUserByEmail(String email) {
        return userRepository.findUserByEmail(email);
    }
    public void deletedUser(String id){
        userRepository.deleteById(id);
    }

    public List<User> getUsersByCity(String city) {
       return userRepository.findByAddressCity(city);
    }
    public List<User> getUserAfterInputTime(LocalDateTime time){
        return userRepository.findByCreatedAfter(time);
    }
}
