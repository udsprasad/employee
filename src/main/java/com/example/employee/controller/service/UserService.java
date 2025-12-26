package com.example.employee.controller.service;

import com.example.employee.controller.external.UserAPICall;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {


    @Autowired
    private UserAPICall userAPICall;

    public String getApiResponse() {
        return userAPICall.getUserApicall();
    }

    @PostConstruct
    public void checkProxy() {
        System.out.println("UserAPICall class: " + userAPICall.getClass());
    }

}
