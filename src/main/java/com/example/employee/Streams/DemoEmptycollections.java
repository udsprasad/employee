package com.example.employee.Streams;

import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class DemoEmptycollections {
    public static void main(String[] args){
        // immutable empty collections
        List<Integer> list = Collections.emptyList();
        Set<Integer> set = Collections.EMPTY_SET;
        Map<String,String> map= Collections.emptyMap();

        //creating immutable collections
        List<?> list1 = Collections.unmodifiableList(list);
        System.out.println(set+" "+list+" "+map);
    }
}
