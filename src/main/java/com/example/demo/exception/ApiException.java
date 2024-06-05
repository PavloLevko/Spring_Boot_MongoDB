package com.example.demo.exception;

import lombok.Data;
import org.springframework.http.HttpStatus;

import java.time.ZonedDateTime;
@Data
public class ApiException extends RuntimeException{
    private final String message;
    private final HttpStatus httpStatus;
    private final ZonedDateTime time;

    public ApiException(String message, HttpStatus httpStatus, ZonedDateTime time) {
        this.message = message;
        this.httpStatus = httpStatus;
        this.time = time;
    }
}
