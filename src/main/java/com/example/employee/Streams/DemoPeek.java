package com.example.employee.Streams;

import java.util.Arrays;
import java.util.List;

public class DemoPeek {

    public static void main(String[] args){
        // in this class we will discuss about peek returns stream but forEach is void type
        List<Integer> list = Arrays.asList(1,4,5,6,7,8);

        list.stream().peek((i) -> {
            System.out.println(i);
        }).sorted().forEach((i) -> {
            System.out.println("after sorting");
            System.out.println(i);});

    }
}
