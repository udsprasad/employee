package com.example.employee.interviewproblems;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
// find the number which is starting with 1
public class Accolite1 {
    public static void main(String[] args) {
      int[] a = {1,2,4,101,201,401,1000};
      optimised(a);

      // using string with streams
        Arrays.stream(a).filter(i -> String.valueOf(i).startsWith("1"))
                .forEach(System.out::println);

    }

    private static void optimised(int[] a) {
        for(int i : a) {
            int temp = i;
            while(temp>=10) {
                temp/=10;
            }
            if(temp == 1) {
                System.out.println(i);
            }
        }
    }
}
