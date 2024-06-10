package com.example.demo.dto;

import com.example.demo.entity.Address;
import com.example.demo.entity.Gender;
import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.data.mongodb.core.index.Indexed;

import java.time.LocalDateTime;
import java.util.List;

@Data
@AllArgsConstructor
public class UserDto {
    private String id;
    @NotBlank(message = "Field should not be empty!")
    @Size(min = 2, max = 20, message = "First name should be min 2, max 20!")
    private String firstName;
    @NotBlank(message = "Field should not be empty!")
    @Size(min = 2, max = 20, message = "First name should be min 2, max 20!")
    private String lastName;
    @NotBlank(message = "Field should not be empty!")
    @Email(message = "Invalid email")
    private String email;
    private List<String> article;
    private Gender gender;
    private Address address;
    @PastOrPresent(message = "Created date must be in the past or present")
    private LocalDateTime created;
}
