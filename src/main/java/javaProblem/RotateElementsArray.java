package javaProblem;

import java.util.Arrays;

public class RotateElementsArray {
    public static void main(String[] a){
        int [] arr = new int [] {1, 2, 3, 4, 5};

        //n determine the number of times an array should be rotated
        int n=1,first=0;

        for(int i=0;i<n;i++){
            first=arr[0];
            int j;
            for(j=0;j<arr.length-1;j++){
                arr[j]=arr[j+1];
            }
            arr[j]=first;
        }
        System.out.println(Arrays.toString(arr));
    }
}
