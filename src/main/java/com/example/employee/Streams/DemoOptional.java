package com.example.employee.Streams;

import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.Optional;
import java.util.stream.Stream;

import static java.util.Optional.ofNullable;

public class DemoOptional {
    public static void main(String[] args){
     // Optional
        List<Integer> list = Arrays.asList(1,4,5,6,7,8);
        String s=null;
        System.out.println(Optional.empty().orElse("Hai"));

    }
}
