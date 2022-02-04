package com.example.employee.interviewproblems;

public class DemoRunnableAndThread {
    // important to understand how threads work
    public static void main(String[] args){
        Runnable run = new Runnable(){
            @Override
            public void run(){
                System.out.println("ABC");
            }
        };
        new Thread(run){
            @Override
            public void run(){
                System.out.println("DEF");// second it will work
            }

            @Override
            public synchronized void start() {
                super.start();
                System.out.println("Hai"); // first it will print
            }
        }.start();
    }
}
