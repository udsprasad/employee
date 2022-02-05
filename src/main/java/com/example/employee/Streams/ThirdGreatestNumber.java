package com.example.employee.Streams;

import java.util.*;
import java.util.stream.Collectors;

public class ThirdGreatestNumber {
    public static void main(String[] args){
        List<Integer> list = Arrays.asList(1,4,5,6,7,8);
        //usingStreamfunction1(list);
        //System.out.println(usingStreamfunction2(list));
        //System.out.println(usingNormalFunction(list));
        Map<String,Integer> map = new HashMap<>();
        String name ="ramarajuarunan";
        System.out.println(printThirdHighestLetter(name,map));
    }
    private static String printThirdHighestLetter(String name, Map<String,Integer> map){
        for(String s:name.split("")){
            if(map.containsKey(s))
                map.replace(s,map.get(s)+1);
            else
                map.put(s,1);
        }
        Optional<Map.Entry<String,Integer>> min=map.entrySet().stream().sorted((i, r) ->Integer.compare(r.getValue(),i.getValue())).limit(3).
                min((i,r) ->Integer.compare(r.getValue(),i.getValue()));
        System.out.println(map.entrySet().stream()
                .sorted((i, r) ->Integer.compare(r.getValue(),i.getValue()))
                .limit(3)
                .collect(Collectors.toMap(Map.Entry::getKey,Map.Entry::getValue))
                );
        return min.get().getKey();
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
