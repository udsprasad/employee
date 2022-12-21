package com.example.employee.interviewproblems;

import java.util.Arrays;

public class AccoliteProblem2 {
    public static void main(String[] args) {
        Integer[] a = {0,1,2,0,1,2,0,1,2};// answer : {0,0,0,2,2,2,1,1,1}
        int countForZero =0;
        for(int i=0;i<a.length;i++){
            if(a[i]==0){
                int temp = a[i];
                a[i]=a[countForZero];
                a[countForZero++]=temp;
            }
        }
        for(int i=a.length-1;i>countForZero;i--){
            if(a[i]==2){
                int temp = a[i];
                a[i]=a[countForZero];
                a[countForZero++]=temp;
            }
        }
        System.out.println(Arrays.toString(a));
    }
}
