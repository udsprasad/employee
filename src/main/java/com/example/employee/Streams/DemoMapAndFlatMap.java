package com.example.employee.Streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Stream;

public class DemoMapAndFlatMap {

    public static void main(String[] args){
        // in class we are looking into Map, flatmap and function interface
        // map will convert one type to another type example

        List<Integer> list1 = Arrays.asList(1,2,3,4,5,6,7);
        List<Integer> list2 = Arrays.asList(8,9,10,11);
        List<Integer> list3 = Arrays.asList(1,2,3,4);

        List<List<Integer>> list = Arrays.asList(list1,list2,list3);
        //example 1
        //here map is converted List to Integer
        list.stream().map(List::stream).forEach(System.out::println); //java.util.stream.ReferencePipeline$Head@65b54208

        //example 2
        //here flatmap is converts from list<list<Integer>> to stream

        list.stream().flatMap(List::stream).forEach(System.out::println);

        // example 3

        Function<List<Integer>,Integer> fun = List::size;
        Function<List<Integer>, Stream<Integer>> fun2 = List::stream;

        list.stream().map(fun).forEach(System.out::println);

        list.stream().flatMap(fun2).forEach(System.out::println);

    }
}
