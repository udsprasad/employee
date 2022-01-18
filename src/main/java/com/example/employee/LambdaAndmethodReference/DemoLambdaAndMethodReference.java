package com.example.employee.LambdaAndmethodReference;

import java.util.*;

public class DemoLambdaAndMethodReference {
    // why interface holds default and static methods bcz common method implementation will be available at interface level
    public static void main(String[] args){
        // using forEach loop , lambda expression and method reference

        // creating list
        List<Integer> list = Arrays.asList(1,2,3,4);
        Map<String,String> map= new HashMap<>(){{
            put("1","name");
            put("2","name2");
        }};

        // using lambda expression to print the loop
        list.forEach(Integer -> System.out.println(Integer));

        // method refernce is shortcut form for lambda expression
        // using method reference
        list.forEach(System.out::println);
        System.out.println("-------");
        list.forEach(System.out::println);
        map.forEach((k,v) -> System.out.println(k+" "+v));
    }
}
