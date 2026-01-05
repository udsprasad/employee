package com.example.employee.interviewproblems;

import java.util.Arrays;

public class AlternativePostionPositiveAndNegative {
    //Rearrange positive and negative numbers in O(n) time and O(1) extra space
    public static void main(String[] args){
        int[] a= {-1, 2, -3, 4, 5, 6, -7, 8, 9};
        int start =1, end =0;
        while (end<a.length && start <a.length) {
            if(a[end] < 0 && end%2 == 0) {
                int temp = a[end];
                a[end] = a[start];
                a[start] = temp;
                start+=2;
            }
            end++;
        }
        System.out.println(Arrays.toString(a));
    }
}
