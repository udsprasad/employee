package com.example.employee.interviewproblems;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class DemoIteratorremove {
    public static void main(String[] args){
        List<String> names = new LinkedList<>();
        names.add("Welcome");
        names.add("To");
        names.add("Gfg");
        Iterator<String> itr = names.iterator();

        while(itr.hasNext()){
            itr.next();
            itr.remove();
            System.out.println(names.size());
        }
    }
}
