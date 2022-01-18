package com.example.employee.Streams;

import java.util.*;
import java.util.stream.Collectors;

public class DemoCollector {
    public static void main(String[] args){
        // In this we will learn collect() and collectors

        List<Integer> list = Arrays.asList(1,4,5,6,7,8);

        Set<Integer> set = list.stream().collect(Collectors.toSet());

        // Collectors.joining
        List<String> list1 = Arrays.asList("1","4","5","6","7","8");
        System.out.println(list1.stream().collect(Collectors.joining(",")));

        // example1 In given string find the frequency of the letters and print the third highest

        String s= "Ramarajuurr";
        List<String> list3 = Arrays.asList(s.split(""));
        Set<String> set3 = new HashSet<String>(list3);

        int first=0,secon=0,thir=0;
        String firstString =null,second=null,third =null;
        for(String i: set3) {
            if(first<Collections.frequency(list3,i)){
                third=second;
                second=firstString;
                firstString=i;
                thir=secon;
                secon=first;
                first=Collections.frequency(list3,i);
            } else {
                if(secon<Collections.frequency(list3,i)){
                    third=second;
                    second=i;
                    thir=secon;
                    secon=Collections.frequency(list3,i);
                } else{
                    if(thir<Collections.frequency(list3,i)) {
                        third = i;
                        thir=Collections.frequency(list3,i);
                    }
                }
            }
        }
        System.out.println(third);

    }
}
