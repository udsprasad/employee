package com.example.employee.DateAndTime;

import java.time.Duration;
import java.time.Instant;

public class DemoInstantAndDuration {
    public static void main(String[] a) throws InterruptedException {
        Instant start = Instant.now();
        Thread.sleep(3000);
        Instant end =Instant.now();
        System.out.println(end);

        // toMillis()
        System.out.println(Duration.between(start,end).toMillis());

        // toMinutes()
        System.out.println(Duration.between(start,end).toMinutes());

    }
}
