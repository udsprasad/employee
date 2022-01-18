package com.example.employee.Streams;

import java.util.List;
import java.util.Arrays;
import java.util.stream.Stream;
import java.util.function.Predicate;

public class DemoStreamwithFilter {
    public static void main(String[] args){
        //Stream will not process the data if you are using only intermediary operation
        //filter uses Predicate Interface
        // filter returns stream

        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7);

        // example 1
        Stream<Integer> stream = list.stream().filter(i -> i>4);
        stream.forEach(System.out::println);

        // example 2
        Predicate<Integer> pred = l -> l>4;
        Predicate<Integer> pred1 = l -> l<6;

        list.stream().filter(pred.and(pred1)).forEach(System.out::println);

    }
}
