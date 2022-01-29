package com.example.employee.java;

import java.util.ArrayList;
import java.util.List;

public class PrimeNumbers {
    // in this class we will print N number of prime number
    public static void main(String[] args){
        int number = 8; // N=8
        List<Integer> list =new ArrayList<>();
        for(int i=2; list.size()<8; i++){
            Boolean flag=false;
            for(int j=2;j<=i/2;j++){
                if(i%j==0){
                    flag =true;
                    break;
                }
            }
            if(flag==false){
                list.add(i);
            }
        }
        System.out.println(list);
    }
}
