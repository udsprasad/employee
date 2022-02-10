package javaProblem.string;

import java.util.Arrays;

public class SubsetString {
    public static void main(String[] args){
        String str="FUN";
        int len= str.length();
        int temp=0;
        String[] array = new String[(len*(len+1))/2];
        for(int i=0;i<len;i++){
            for(int j=i;j<len;j++){
                array[temp]=str.substring(i,j+1);
                temp++;
            }
        }
        System.out.println(Arrays.toString(array));
    }
}
