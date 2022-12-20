package com.example.employee.interviewproblems;

import java.util.Arrays;

public class ProductElementsInArray {
    public static void main(String[] args) {
        int[] a ={1,2,3,4,5};
        int product=1;
        for(int i=0;i<a.length;i++){
         product*=a[i];
        }
        for(int i=0;i<a.length;i++){
            a[i]=product/a[i];
        }

        System.out.println(Arrays.toString(a));
    }
}
