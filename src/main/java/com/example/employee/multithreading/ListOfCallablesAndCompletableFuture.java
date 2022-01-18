package com.example.employee.multithreading;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.*;

public class ListOfCallablesAndCompletableFuture {
    /* this class is used to understand invokeAll and invokeAny methods
    * url: https://winterbe.com/posts/2015/04/07/java8-concurrency-tutorial-thread-executor-examples/ */
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        List<Callable<String>> tasks = Arrays.asList(() -> "Name", () -> "name2", () -> "name3");
        ExecutorService executor = Executors.newFixedThreadPool(3);
        executor.invokeAll(tasks).stream().map(future -> {
            try {
                return future.get();
            } catch (Exception e) {
                throw new IllegalStateException(e);
            }
        }).forEach(System.out::println);
        executor.shutdown();

        // completablefuture
        CompletableFuture<String> task1 = CompletableFuture.supplyAsync(()->"String1");
        CompletableFuture<String> task2 = CompletableFuture.supplyAsync(()->"String2");
        System.out.println(task1.get()+","+task2.get());

        //thenApply()- Returns a new CompletionStage where the type of the result is based on the argument to the supplied function of thenApply() method.
        //
        //thenCompose()- Returns a new CompletionStage where the type of the result is same as the type of the previous stage.

        CompletableFuture<CompletableFuture<String>> cf = CompletableFuture.supplyAsync(()->{
            return "Hello";
        }).thenApply(value-> {
            String str = value.toUpperCase();
            return CompletableFuture.completedFuture(str);
        });
        System.out.println("Value- " + cf.get().get());

        // then compose example

        CompletableFuture<String> cf1 = CompletableFuture.supplyAsync(()->{
            return "Hello";
        }).thenCompose(value-> {
            String str = value.toUpperCase();
            return CompletableFuture.completedFuture(str);
        });
        System.out.println("Value- " + cf1.get());
    }
}
