package com.example.employee.interviewproblems;

import java.util.Arrays;

public class AlternativePostionPositiveAndNegative {
    //Rearrange positive and negative numbers in O(n) time and O(1) extra space
    public static void main(String[] args){
        int[] a= {-1, 2, -3, 4, 5, 6, -7, 8, 9};
        int i = -1, temp = 0;
        for (int j = 0; j < a.length; j++)
        {
            if (a[j] < 0)
            {
                i++;
                temp = a[i];
                a[i] = a[j];
                a[j] = temp;
            }
        }
        int pos = i+1, neg = 0;

        // Increment the negative index by 2 and positive index by 1, i.e.,
        // swap every alternate negative number with next positive number
        while (pos < a.length && neg < pos && a[neg] < 0)
        {
            temp = a[neg];
            a[neg] = a[pos];
            a[pos] = temp;
            pos++;
            neg += 2;
        }
        System.out.println(Arrays.toString(a));
    }
}
