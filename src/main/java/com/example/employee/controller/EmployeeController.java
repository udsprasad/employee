package com.example.employee.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

    @Value("${my.greetings}")
    private String greetings;

    @GetMapping("/greetings")
    public String getGreeting(){
        return greetings;
    }

}
