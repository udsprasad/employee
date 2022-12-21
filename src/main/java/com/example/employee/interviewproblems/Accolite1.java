package com.example.employee.interviewproblems;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
// find the number which is starting with 1
public class Accolite1 {
    public static void main(String[] args) {
      Integer[] a = {1,2,4,101,201,401,1000};
        List<Integer> list = Arrays.stream(a).filter(i->
            String.valueOf(i).startsWith("1")).collect(Collectors.toList());
        System.out.println(list);
    }
}
