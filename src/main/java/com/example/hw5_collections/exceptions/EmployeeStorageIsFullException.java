package com.example.hw5_collections.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.BAD_REQUEST, reason = "EmployeeStorageIsFullException")
public class EmployeeStorageIsFullException extends RuntimeException{

    public EmployeeStorageIsFullException(String message) {
        super(message);
    }
}
