package com.example.employee.Streams;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class DemoStreamwithForEach {
    public static void main(String[] args){
        //Stream does nt hold any data this is the basic difference between collection and stream
        // In this class we will see forEach and Consumer Interface

        Stream<String> stream = Stream.of("one","two","three","four");
        List<String> list = new ArrayList<>();
        // here we are creating chain consumers
        Consumer<String> c1 = list::add;
        Consumer<String> c2 = System.out::println;

        stream.forEach(c1.andThen(c2));

        list.forEach(System.out::println);
    }
}
