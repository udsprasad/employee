package com.example.employee.java;

import java.util.Arrays;
import java.util.List;

public class BubbleSort {
    public static void main(String[] args){
        int[] list = {4,2,1,7,10,9};
        Integer temp=null;
        for(int i=0;i< list.length;i++){
            for(int j=0;j< list.length-1;j++){
                if(list[j]>list[j+1]){
                    temp=list[j];
                    list[j]=list[j+1];
                    list[j+1]=temp;
                }
            }
        }
        System.out.println(Arrays.toString(list));
    }
}
