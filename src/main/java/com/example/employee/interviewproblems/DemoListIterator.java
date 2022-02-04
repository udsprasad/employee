package com.example.employee.interviewproblems;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class DemoListIterator {
    public static void main(String[] args){
        List<String> names = new LinkedList<>();
        names.add("Welcome");
        names.add("To");
        names.add("Gfg");

        // Getting ListIterator
        ListIterator<String> namesIterator
                = names.listIterator();

        // Traversing elements
        while (namesIterator.hasNext()) {
            System.out.println(namesIterator.next());
            namesIterator.previous(); //prints infinite values
        }
    }
}
