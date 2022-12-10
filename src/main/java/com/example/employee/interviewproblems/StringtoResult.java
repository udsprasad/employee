package com.example.employee.interviewproblems;

public class StringtoResult {
    public static void main(String[] args){
     String s = "12a4";
     // combine 1+2+4+1 treat a =1 b=2 c=3
        // divide the sum with 3 if reminder is zero then quotient is result else remainder is result
       int sum =0;
        for(char c: s.toCharArray()){
            if(Character.isDigit(c)){
                sum+=Integer.parseInt(String.valueOf(c)); // c- '0';
            } else {
                sum+=(c-'a'+1);
            }
        }

        if(sum%3==0){
            System.out.println(sum/3);
        } else {
            System.out.println(sum%3);
        }
    }
}
