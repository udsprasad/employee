package com.example.employee.multithreading;

public class DemoThread extends Thread{
    // to create thread class we need to extend the Thread class and override the run method
    @Override
    public void run(){
        System.out.println("****Thread Class created****");
        System.out.println(Thread.currentThread().getName());
    }

    public static void main(String[] args){
        //If you extend with thread class then create the object of the class is enough to create
        //the thread object
        // need to use start method to execute the method on Thread
        new DemoThread().start();
        System.out.println(Thread.currentThread().getName());
    }
}
