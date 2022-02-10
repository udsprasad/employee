package javaProblem.string;

import java.util.Arrays;

public class DivideStringInNEqualParts {
    public static void main(String[] args){
        String str = "aaaabbbbcccc";
        //n determines the variable that divide the string in 'n' equal parts
        int n = 3;
        int chars = str.length()/n;
        int k=0;
        String[] array = new String[n];
        if(str.length()%n!=0){
            System.out.println("not possible");
        } else {
            for(int i=0;i<str.length()&&k<n;i=i+chars,k++){
                array[k]=str.substring(i,i+chars);
            }
            System.out.println(Arrays.toString(array));
        }
    }
}
