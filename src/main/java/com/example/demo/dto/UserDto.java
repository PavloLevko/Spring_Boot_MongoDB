package com.example.demo.dto;

import com.example.demo.entity.Address;
import com.example.demo.entity.Gender;
import jakarta.validation.constraints.Email;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.data.mongodb.core.index.Indexed;

import java.time.LocalDateTime;
import java.util.List;

@Data
@AllArgsConstructor
public class UserDto {
    private String id;
    private String firstName;
    private String lastName;
    @Email(message = "Invalid email")
    private String email;
    private List<String> article;
    private Gender gender;
    private Address address;
    private LocalDateTime created;
}
