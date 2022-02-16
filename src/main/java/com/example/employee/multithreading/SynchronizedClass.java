package com.example.employee.multithreading;

public class SynchronizedClass {
    int count = 1;
    static int NUM;
    public void printEven(){
        synchronized(this){
            System.out.println("locked printEven");
            while(count<NUM) {
                if (count % 2 == 1) {
                    try {
                        wait();
                        System.out.println("released locked on printEven");
                    } catch (InterruptedException e) {
                        e.getStackTrace();
                    }

                }
                System.out.println(count);
                ++count;
                notify();
                System.out.println("notified ..");
            }
        }
    }
    public void printOdd(){
        synchronized(this){
            System.out.println("locked printOdd");
            while(count<NUM) {
                if (count % 2 == 0) {
                    try {
                        wait();
                        System.out.println("released locked on printOdd");
                    } catch (InterruptedException e) {
                        e.getStackTrace();
                    }

                }
                System.out.println(count);
                ++count;
                notify();
                System.out.println("notified ..");
            }
        }

    }

    public static void main(String[] args){
        NUM=20;
        SynchronizedClass s = new SynchronizedClass();
        new Thread(()->s.printOdd()).start();
        new Thread(()->s.printEven()).start();
    }
}
