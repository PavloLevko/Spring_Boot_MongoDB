package com.example.demo.repository;

import com.example.demo.dto.UserDto;
import com.example.demo.entity.User;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

public interface UserRepository extends MongoRepository<UserDto, String> {
    Optional<UserDto> findUserByEmail(String email);
    List<UserDto> findByAddressCity(String city);
    List<UserDto> findByCreatedAfter(LocalDateTime time);
}
