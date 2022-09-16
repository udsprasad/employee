package com.example.employee.interviewproblems;

public class DemoString {
    public static void  main(String[] args){
       String s= "test";
       String s1= new String("test");
       String s2 = new String("test").intern();
        System.out.println(s==s2);
    }
}
