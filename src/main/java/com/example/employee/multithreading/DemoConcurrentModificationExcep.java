package com.example.employee.multithreading;

import java.util.*;

public class DemoConcurrentModificationExcep {
    // List,Map class testing
    public static void main(String[] args) {
       List<Integer> list = new ArrayList<>(){{
           add(1);
           add(2);
           add(3);
       }};

       Iterator<Integer> it = list.iterator();
       while(it.hasNext()){
           if(it.next() == 1)
               //list.remove(it.next()); // this line gives ConcurrentModificationException for both List and
               // Set not for Map
               it.remove();

       }
        System.out.println(list);

       // verifying using forEachloop it should fail but if you use normal for loop it won't fail
       for(Integer i: list){
           if(i==2)
               System.out.println(i);
               //list.add(i); // get concurrentexception belongs to iterator
       }
       System.out.println(list);

       // to avoid concurrent exception using normal for loop
        // and removeIf in java8
        list.removeIf(value -> value.equals(2));
        System.out.println(list);

        Map<String,Integer> map = new HashMap<>(){{
            put("one",1);
            put("two",2);
            put("three",3);
        }};
         for(Map.Entry entry: map.entrySet()){
             System.out.println(entry.getKey() +" "+ entry.getValue());
         }
    }
}
