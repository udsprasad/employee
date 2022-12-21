package com.example.employee.interviewproblems;

import java.util.Optional;

public class TestOptional {
    public static void main(String[] args) {
        String str = null;
        //System.out.println(Optional.of(str)); returns Null pointer exception
        System.out.println(Optional.ofNullable(str)); // returns Optional.empty
    }
}
