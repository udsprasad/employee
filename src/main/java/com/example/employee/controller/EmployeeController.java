package com.example.employee.controller;

import com.example.employee.entity.Department;
import com.example.employee.entity.Employee;
import com.example.employee.service.EmployeeService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@Slf4j
@RequestMapping("/employee")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping("/{id}")
    public Optional<Employee> getEmployeeById(@PathVariable Long id){
        log.info("implementing getEmployeeById method in controller");
        return employeeService.getEmployeeById(id);
    }

    @PostMapping("/getEmployeesByDepartment")
    public List<Employee> getEmployeesByDepartment(@RequestBody Department department){
        log.info("implementing getEmployeesByDepartment method in controller");
        return employeeService.getEmployeesByDepartment(department);
    }
}
