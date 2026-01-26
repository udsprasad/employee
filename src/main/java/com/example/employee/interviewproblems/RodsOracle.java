package com.example.employee.interviewproblems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

// first find the min length in the list
// second remove the min rod length elements from the list and at the sametime cut the min length from the remaining elements
// add the size of each outcome of the list to rod list
// example 5 4 4 2 2 8 -> 6
// 2 is min 3 2 2 5    -> 4
// 2 is min 1 3        -> 2
// 1 min   2           -> 1
public class RodsOracle {
    public static void main(String[] args){
        List<Integer> lengths = new ArrayList<>(Arrays.asList(5,4,4,2,2,8));
        List<Integer> rods = new ArrayList<>();
        while(!lengths.isEmpty()){
            rods.add(lengths.size());
            Integer min = lengths.stream().min(Integer::compare).get();
            lengths = lengths.stream().filter(i -> i!=min).map(i->i-min).collect(Collectors.toList());
        }
        System.out.println(rods);
    }
}

//import java.util.*;
//
//public class RodCutON {
//    public static void main(String[] args) {
//        int[] rods = {5, 4, 4, 2, 2, 8};
//
//        int max = Arrays.stream(rods).max().getAsInt();
//
//        int[] freq = new int[max + 1];
//        for (int rod : rods) {
//            freq[rod]++;
//        }
//
//        List<Integer> rodSizes = new ArrayList<>();
//        int remaining = rods.length;
//
//        for (int len = 1; len <= max; len++) {
//            if (freq[len] > 0) {
//                rodSizes.add(remaining);
//                remaining -= freq[len]; // remove rods equal to this length
//            }
//        }
//
//        System.out.println(rodSizes);
//    }
//}
