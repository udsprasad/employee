package com.example.employee.interviewproblems;


import org.apache.tomcat.util.net.jsse.JSSEUtil;

import java.util.Arrays;

public class MoveAllZeroes2end{
    public static void main(String[] args){
        int[] a={0,0,1,2,13};
        int count=0;
        for(int i=0;i<a.length;i++){
            if(a[i]!=0)
                a[count++]=a[i];
        }
        while(count<a.length)
            a[count++]=0;
        System.out.println(Arrays.toString(a));
    }
}
