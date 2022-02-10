package javaProblem;

import java.util.Arrays;

public class ReverseString {

    //How to reverse a String in Java
    public static void main(String[] args){
        String s="Ramaraju";
        System.out.println(reverseStringWithCharArray(s));
        System.out.println(reverStringWithStringBuilder(s));
    }

    private static String reverStringWithStringBuilder(String s) {
        StringBuilder reverseString= new StringBuilder(s);
        return reverseString.reverse().toString();
    }

    private static String reverseStringWithCharArray(String name){
        char[]  reverseString = new char[name.length()];
        char[] givenString = name.toCharArray();
        for(int i=givenString.length-1,j=0;i>=0;i--,j++){
            reverseString[j]=givenString[i];
        }
        return new String(reverseString);
    }
}
