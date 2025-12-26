package com.example.employee.externalCalls;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

import java.util.concurrent.CompletableFuture;

@Component
public class AddressCall {

    @Async()
    public CompletableFuture<String> getAddress() throws InterruptedException {
        System.out.println("Running in thread: " + Thread.currentThread().getName());
        Thread.sleep(3000);
        return CompletableFuture.completedFuture("got the address Response");
    }

    /*
    here’s the correct pattern to handle exceptions inside @async

@Async
public CompletableFuture<String> callRemoteService(String url) {
    try {
        String response = restTemplate.getForObject(url, String.class);
        return CompletableFuture.completedFuture(response);
    } catch (ResourceAccessException ex) {
        // Propagate exception via CompletableFuture
        CompletableFuture<String> failedFuture = new CompletableFuture<>();
        failedFuture.failedFuture(ex);
        return failedFuture;
    }
}
     */
}
