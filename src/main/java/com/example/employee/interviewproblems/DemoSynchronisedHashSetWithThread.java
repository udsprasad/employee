package com.example.employee.interviewproblems;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class DemoSynchronisedHashSetWithThread {
    public static void main(String[] args){
        Set<String> s= Collections.synchronizedSet(new HashSet<>());
        s.add("A");
        s.add("B");
        s.add("C");

        Iterator<String> itr = s.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
            //s.add("D");  // ConcurrentModificationException
           // s.add("E");
        }

        for(String string: s){
            System.out.println(string); //first prints A and then throw exceptions
            System.out.println(s.size());
            s.add("D");
            s.add("E");
        }

    }
}
