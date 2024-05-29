package com.example.demo;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.ZonedDateTime;
import java.util.List;
@Data
@Document
public class User {
    @Id
    private Long id;
    private String firstName;
    private String lastName;
    private String email;
    private List<String> article;
    private Gender gender;
    private Address address;
    private ZonedDateTime created;
}
