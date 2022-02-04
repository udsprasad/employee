package com.example.employee.Streams;

import java.util.List;
import java.util.stream.Collectors;

public class DemoSorted {
    public static void main(String[] args){
        List<Integer> list = List.of(7,4,1,5,9,8);

        List<Integer> sortedlist = list.stream().sorted().collect(Collectors.toList());

        System.out.println(sortedlist);
    }
}
