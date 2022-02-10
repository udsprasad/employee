package javaProblem;

import java.util.HashMap;
import java.util.Map;

public class FrequencyEachElementInTheArray {
    public static void main(String[] a){
        int[] array = {1, 2, 8, 3, 2, 2, 2, 5, 1 };
        Map<Integer,Integer> map= new HashMap<>();
        for(int i=0;i< array.length;i++){
            if(map.containsKey(array[i])){
                map.replace(array[i],map.get(array[i])+1);
            } else {
                map.put(array[i],1);
            }
        }
        System.out.println(map);
    }
}
