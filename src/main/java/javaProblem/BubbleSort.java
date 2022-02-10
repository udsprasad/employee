package javaProblem;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class BubbleSort {
    public static void main(String[] args){
        List<Integer> list = Arrays.asList(4,7,6,9,8,1,2);

        // using collection sort
//        Collections.sort(list);
//        System.out.println(list);

        //using stream sort
        list.stream().sorted().forEach(System.out::println);

        // using sort in list
//        list.sort(Comparator.naturalOrder());
//        System.out.println(list);
        Integer[] array = list.toArray(Integer[]::new);
        for(int i=0;i<array.length;i++){
            for(int j=0;j<array.length-1;j++){
                if(array[j]>array[j+1]) {
                    Integer temp=null;
                    temp=array[j];
                    array[j] =array[j+1];
                    array[j+1]=temp;
                }
            }
        }
        System.out.println(Arrays.toString(array));

        Integer[] array1 = list.toArray(Integer[]::new);
        for(int i=1;i<array1.length;i++){
            if(array1[i]<array1[i-1]) {
                    Integer temp=null;
                    temp=array1[i];
                    array1[i] =array1[i-1];
                    array1[i-1]=temp;
                    i=0;
            }
        }
        System.out.println(Arrays.toString(array1));

    }
}
