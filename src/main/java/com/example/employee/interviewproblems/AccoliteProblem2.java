package com.example.employee.interviewproblems;

import java.util.Arrays;

public class AccoliteProblem2 {
    public static void main(String[] args) {
        int[] a = {0,1,2,0,1,2,0,1,2};// answer : {0,0,0,2,2,2,1,1,1}
        int start =0, mid =0, end = a.length-1;
        while(mid<=end) {
            if(a[mid] == 0) {
                swap(a, start, mid);
                start++;
                mid++;
            } else if(a[mid] == 1) {
                swap(a, mid, end);
                end--;
            } else {
                mid++;
            }
        }
        System.out.println(Arrays.toString(a));
    }

    private static void swap(int[] a, int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;

    }
}
