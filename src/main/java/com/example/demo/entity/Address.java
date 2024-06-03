package com.example.demo.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@AllArgsConstructor
public class Address {
    private String country;
    private String city;
    private String postCode;
}
