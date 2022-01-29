package com.example.employee.java;

public class Fibonacci {
    // 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144
    static int a=0,b=1,c=0;
    public static void main(String[] args){
        int count = 9;
        for(int i=0;i<count;i++)
            System.out.println(fibo(i));
    }

    private static int fibo(int i) {
        if(i<=1)
            return i;
        return fibo(i-1)+fibo(i-2);
    }


//    private static void fibo(int i) {
//        if(i>0){
//            System.out.println(a);
//            c=a+b;
//            a=b;
//            b=c;
//            fibo(i-1);
//        }
//    }
}
