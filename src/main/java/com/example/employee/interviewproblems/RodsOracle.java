package com.example.employee.interviewproblems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

// first find the min length in the list
// second remove the min rod length and cut the min length from the remaining elements
// add the size of each outcome
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
