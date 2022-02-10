package javaProblem;

import java.util.Arrays;

public class RemoveDuplicateElement {
    public static void main(String[] args){
        int a[] = {10,20,20,30,30,40,50,50}; //ascending order
        int temp[] = new int[a.length];
        int k=0;
        for(int j=0;j<a.length-1;j++){
            System.out.println(a[j]+" "+a[j+1]);
                if(a[j]!=a[j+1]){
                    System.out.println("true");
                    temp[k++]=a[j];
                }
        }
       temp[k++]=a[a.length-1];
        for (int i=0; i<temp.length; i++)
            System.out.print(temp[i]+" ");
     }
}

