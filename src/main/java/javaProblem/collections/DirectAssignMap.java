package javaProblem.collections;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DirectAssignMap {
    public static void main(String[] args){
        List<Integer> integers= Arrays.asList(1,2,3,4,5);
        List<Integer> list =integers;
        System.out.println(list);

        // map test

        Map<String, String> tempMap = new HashMap<>(){{
            put("1","1");
            put("2","2");
        }};
        Map<String, String> map=tempMap;
        System.out.println(map);
    }
}
