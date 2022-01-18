package com.example.employee.Streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class DemoReduceOperation {
    public static void main(String[] args){
        // reduce operator is equal to SQL aggregator functions like max min and sum

        List<Integer> list1 = Arrays.asList(1,2,3,4,5,6,7);

        // reduce holds identity operator as first value and binary operator as second value
        System.out.println(list1.stream().reduce(0,Integer::sum));
        System.out.println(list1.stream().max(Comparator.naturalOrder()));

    }
}
