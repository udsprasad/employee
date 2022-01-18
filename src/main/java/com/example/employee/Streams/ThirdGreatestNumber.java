package com.example.employee.Streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class ThirdGreatestNumber {
    public static void main(String[] args){
        List<Integer> list = Arrays.asList(1,4,5,6,7,8);
        usingStreamfunction1(list);
        System.out.println(usingStreamfunction2(list));
        System.out.println(usingNormalFunction(list));
    }

    private static Integer usingNormalFunction(List<Integer> list) {
        Integer first=0,second=0,third=0;
        for(Integer i: list){
            if(i>first){
                third=second;
                second=first;
                first=i;
            }
        }
        return third;
    }

    private static Integer usingStreamfunction2(List<Integer> list) {
        return list.stream().sorted(Comparator.reverseOrder()).limit(3).
                min(Comparator.naturalOrder()).get();
    }

    private static void usingStreamfunction1(List<Integer> list) {
        Optional.ofNullable(list).ifPresent(list1 ->
            list1.stream().sorted(Comparator.reverseOrder()).limit(3)
                    .sorted(Comparator.naturalOrder()).limit(1).forEach(System.out::println)
        );
    }

}
