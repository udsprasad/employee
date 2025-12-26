package com.example.employee.controller;

import com.example.employee.controller.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.HttpServerErrorException;
import org.springframework.web.client.ResourceAccessException;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/employee")
public class EmployeeController {


    @Autowired
    private UserService userService;

    @GetMapping("/greetings")
    public String getGreeting(){
        return userService.getApiResponse();
    }

    @ExceptionHandler(HttpServerErrorException.class)
    public ResponseEntity<String> handleHttpServerErrorException(HttpServerErrorException runtimeException) {
        return ResponseEntity.internalServerError().body(runtimeException.getMessage());
    }

    @ExceptionHandler(ResourceAccessException.class)
    public ResponseEntity<String> handleResourceAccessException(ResourceAccessException runtimeException) {
        return ResponseEntity.internalServerError().body(runtimeException.getMessage());
    }
}
