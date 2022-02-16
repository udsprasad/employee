package javaProblem.arrays;

import java.util.Arrays;

public class CountingSort {
    public static void main(String[] args){
        int[] a ={0,0,12,2,13};
        // result a={1,2,13,0,0}
        int[] output= new int[a.length];
        int max=0;
        for(int i=0;i<a.length;i++){
            if(max<a[i]){
                max=a[i];
            }
        }
        max++;
        int[] count  = new int[max];
        for(int i=0;i<a.length;i++){
          count[a[i]]++;
        }
        for(int i=1;i<max;i++){
            count[i]=count[i]+count[i-1];
        }
        for(int i=a.length-1;i>=0;i--){
             output[--count[a[i]]]  =a[i];
        }
        System.out.println(Arrays.toString(output));
    }
}
