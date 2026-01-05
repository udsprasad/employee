package com.example.employee.interviewproblems;

import java.util.Arrays;

public class KeepAllNegativesToStart {
    // below technique preserve the order but time complexity is o(n2)
    // if we want o(n) then need to use extra array
    // alternatively if we don't want order then use
    // two pinter to solve it
    public static void main(String[] args) {
        int[] a = {-1,2,-3,4,5,-6};
        int end = 0;
        while(end < a.length) {
            if(a[end] < 0) {
                end++;
            } else {
                int j = end;
                // looping until we find next negative
                while(j<a.length && a[j]> 0) j++;

                if(j==a.length) break;

                // if we find negative before array length then rotate by one
                rotateByOne(a, end , j);
                end++;
            }
        }
        System.out.println(Arrays.toString(a));
    }

    private static void rotateByOne(int[] a, int i, int j) {
        int temp = a[j];
        while(j>i) {
            a[j] = a[j-1];
            j--;
        }
        a[j] = temp;
    }
}
