package com.example.employee.multithreading;

public class DemoRunnable implements Runnable{
    // to create thread class we can implement the Runnable interface and override the run method
    // runnable interface returns void value
    // for return type we need to use callable interface

    @Override
    public void run(){
        System.out.println("****" + Thread.currentThread().getName() + "****");
    }

    public static void main(String[] args){
        // to start the thread we need to create instance for class implemented with Runnable first
        // later we need to create the object for thread class
        DemoRunnable demo = new DemoRunnable();
        Thread thread = new Thread(demo,"First");
        thread.start();

        // using lambda expression
        Runnable run = () -> System.out.println("****" + Thread.currentThread().getName() + "****");
        new Thread(run,"Second").start();
    }
}
