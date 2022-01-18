package com.example.employee.multithreading;

import java.util.concurrent.*;

public class DemoCallable {
    // In this class we have implementation for Callable , ExecutorService, Future and Executor
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        Callable<Integer> task = () -> 1;

        ExecutorService service = Executors.newSingleThreadExecutor();

        Future<Integer> result=service.submit(task);

        System.out.println(result.get()); // here main thread will wait until the child thread returns
                                          // value
        service.shutdown(); // it is very important method to shutdown the executor

    }
}
