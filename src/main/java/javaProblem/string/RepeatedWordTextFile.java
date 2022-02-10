package javaProblem.string;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class RepeatedWordTextFile {
    public static void main(String[] args) throws IOException {
        String line;
        int countWords=0;
        Map<String,Integer> map = new HashMap<>();
       BufferedReader br= new BufferedReader(new FileReader("src\\main\\resources\\data.txt"));
       while((line=br.readLine())!=null){
           countWords += line.split("[,.\\s]+").length;
           for(String s:line.split("[,.\\s]+")){
               if(map.containsKey(s)){
                   map.replace(s,map.get(s)+1);
               } else{
                   map.put(s,1);
               }
           }

       }
       System.out.println(map.entrySet().stream().max(Comparator.comparingInt(Map.Entry::getValue))
               .get().getKey()+" "+countWords);
       br.close();
    }
}
