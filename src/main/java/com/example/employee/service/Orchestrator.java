package com.example.employee.service;

import com.example.employee.externalCalls.AddressCall;
import com.example.employee.externalCalls.DepartmentCall;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionException;

@Service
public class Orchestrator {

    private static final Logger log = LoggerFactory.getLogger(Orchestrator.class);
    private AddressCall addressCall;

    private DepartmentCall departmentCall;

    public Orchestrator(DepartmentCall departmentCall, AddressCall addressCall) {
        this.departmentCall = departmentCall;
        this.addressCall = addressCall;
    }


    public String getWorkFlow() throws InterruptedException {
        CompletableFuture<String> address = addressCall.getAddress();
        CompletableFuture<String> department = departmentCall.getDepartment();

        try {
            CompletableFuture.allOf(address, department).join();
        } catch (CompletionException e) {
            log.error("exception {}", e.getMessage(), e);
        }

        return address.thenCombine(department, (a, d) ->
                String.format("Address :%s and department: %s", a, d)).join();
    }

}
