package com.example.demo;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

@Data

public class Address {
    private String country;
    private String City;
    private String postCode;
}
