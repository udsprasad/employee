package com.example.employee.collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class DemoStack {

    public static int studentStack(List<Integer> height){
        Stack<Integer> s = new Stack<Integer>();
        for(Integer i : height){
            if(s.isEmpty()||s.peek()!=i){
                s.push(i);
            }
            else {
                s.pop();
            }
        }
        int sum =0;
        while(!s.isEmpty()){
            sum+=s.peek();
            s.pop();
        }
        return sum;
    }

    public static void main(String[] args){
        System.out.println(studentStack(new ArrayList(){{
            add(4);
            add(2);
            add(10);
            add(10);
            add(2);
            add(6);
        }}));
    }
}
