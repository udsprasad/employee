package com.example.employee.DateAndTime;

import com.example.employee.entity.Department;
import com.example.employee.entity.Employee;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.json.simple.JSONObject;

import java.util.Map;


public class Testing {
    public static void main(String[] args) throws JsonProcessingException {
        Employee employee = new Employee(1L, "Raju", "Developer", "45000", new Department(1L,"FS"));
        System.out.println(new ObjectMapper().writeValueAsString(employee));


    }
}
