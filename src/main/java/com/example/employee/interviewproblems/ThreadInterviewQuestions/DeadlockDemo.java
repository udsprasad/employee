package com.example.employee.interviewproblems.ThreadInterviewQuestions;

class DeadlockDemo {
    static final Object A = new Object();
    static final Object B = new Object();

    public static void main(String[] args) {
        new Thread(() -> {
            synchronized (A) {
                System.out.println("Thread 1 locked A");
                synchronized (B) {
                    System.out.println("Thread 1 locked B");
                }
            }
        }).start();

        new Thread(() -> {
            synchronized (B) {
                System.out.println("Thread 2 locked B");
                synchronized (A) {
                    System.out.println("Thread 2 locked A");
                }
            }
        }).start();
    }
}

// answer:
//How to Fix It (Without Removing synchronized)
//✅ Fix 1: Lock ordering (BEST answer)
//
//Always acquire locks in the same order.
//
//synchronized (A) {
//    synchronized (B) {
//        // safe
//    }
//}
//
//
//Use this order everywhere in the application.
//
//✅ Fix 2: Use single lock
//synchronized (A) {
//    // do both operations
//}
//
//
//Simple but reduces concurrency.
//
//✅ Fix 3: Use java.util.concurrent.locks
//ReentrantLock lockA = new ReentrantLock();
//ReentrantLock lockB = new ReentrantLock();
//
//if (lockA.tryLock()) {
//    if (lockB.tryLock()) {
//        // work
//    }
//}
//
//execution:
//
//Thread-1 gets lockA
//
//Thread-2 gets lockB
//
//Thread-1 fails to get lockB → backs out
//
//Thread-2 fails to get lockA → backs out
//
//One thread retries and succeeds


