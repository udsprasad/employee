package com.example.employee.controller.service;

import com.example.employee.controller.external.ExternalService;
import com.example.employee.controller.external.FirstRetryAndCircuitBreakerAnnotation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {


    @Autowired
    private ExternalService firstRetryAndCircuitBreakerAnnotation;


    public String getFirstRetry() {
        for (int i=0; i< 20; i++) {
            System.out.println(firstRetryAndCircuitBreakerAnnotation
                    .getUserApicall(i));
            System.out.println("-----------");
        }
        return "hi";
    }


}
