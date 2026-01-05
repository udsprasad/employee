package com.example.employee.interviewproblems;

import java.util.Arrays;

public class Waveproblem {
    public static void main(String[] args) {
        int[] a = {3,6,5,10,7,20};
        int end =0;
        while(end<a.length-1) {
            if(a[end] < a[end+1] && end%2 ==0) {
                int temp = a[end];
                a[end] = a[end+1];
                a[end+1] = temp;
            }
            end ++;
        }
        System.out.println(Arrays.toString(a));
    }
}
