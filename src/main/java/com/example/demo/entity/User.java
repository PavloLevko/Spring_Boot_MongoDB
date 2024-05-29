package com.example.demo.entity;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.util.List;
@Data
@Document
public class User {
    @Id
    private String id;
    private String firstName;
    private String lastName;
    private String email;
    private List<String> article;
    private Gender gender;
    private Address address;
    private LocalDateTime created;

    public User(String firstName, String lastName, String email, List<String> article, Gender gender, Address address, LocalDateTime created) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.article = article;
        this.gender = gender;
        this.address = address;
        this.created = created;
    }
}
