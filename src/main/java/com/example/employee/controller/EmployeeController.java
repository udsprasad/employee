package com.example.employee.controller;

import com.example.employee.service.Orchestrator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

    @Autowired
    private Orchestrator orchestrator;

    @GetMapping("/Async")
    public String getAsync() throws InterruptedException {
        long start = System.currentTimeMillis();
        String result = orchestrator.getWorkFlow();
        long end = System.currentTimeMillis();
        System.out.println((end-start)/1000);
        return result;
    }

}
