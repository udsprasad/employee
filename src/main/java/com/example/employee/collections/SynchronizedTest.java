package com.example.employee.collections;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

public class SynchronizedTest {
    public static void main(String[] args){
        Set<Integer> set = new HashSet<>(Arrays.asList(1,2,3,4,5));
        Set<Integer> syncSet= Collections.synchronizedSet(set);
        Set<Integer> concurrentSet= new CopyOnWriteArraySet<>(set);
        for(Integer i: concurrentSet){
            if(i==3){
                concurrentSet.remove(3);
            }
        }

    }
}
