package com.example.employee.externalCalls;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

import java.util.concurrent.CompletableFuture;

@Component
public class DepartmentCall {

    @Async
    public CompletableFuture<String> getDepartment() throws InterruptedException {
        System.out.println("Running in thread: " + Thread.currentThread().getName());
        Thread.sleep(3000);
        return CompletableFuture.completedFuture("got the department Response");
    }
}
