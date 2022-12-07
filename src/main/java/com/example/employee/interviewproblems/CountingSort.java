package com.example.employee.interviewproblems;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class CountingSort {
    public static void main(String[] args) {
       Integer[] a ={5, 2, 8, 7, 1,1 };
       Map<Integer,Integer> map = new HashMap<>();
       for(Integer i:a){
       if(map.containsKey(i)){
           map.replace(i,map.get(i)+1);
       } else {
           map.put(i,1);
       }
       }
       int count =0;
       for(Integer i: map.keySet()){
           int temp =map.get(i);
           while(temp>0){
               a[count++]=i;
               temp--;
           }
       }
       System.out.println(Arrays.toString(a));
    }
}
