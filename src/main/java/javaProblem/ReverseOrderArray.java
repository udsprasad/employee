package javaProblem;

import java.util.Arrays;
import java.util.Comparator;

public class ReverseOrderArray {
    public static void main(String[] args){
        Integer [] a = new Integer [] {1, 2, 3, 4, 5};
        Arrays.sort(a,Comparator.reverseOrder());
        System.out.println(Arrays.toString(a));

        //print the elements of an array present on even position
        for(int i=1;i<a.length;i=i+2){
            System.out.println(a[i]);
        }
    }
}
