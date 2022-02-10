package javaProblem.string;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class MinAndMaxOccurenceOfCharacter {
    public static void main(String[] args){
        String str = "grass is greener on the other side";
        Map<String,Integer> map = new HashMap<>();
        for(String s:str.split("")){
            if(!s.equals(" ")){
                if(map.containsKey(s)){
                    map.replace(s,map.get(s)+1);
                }
                else{
                    map.put(s,1);
                }
            }
        }
        System.out.println(map.entrySet().stream().max(Comparator.comparingInt(Map.Entry::getValue)).get().getKey());

    }
}
