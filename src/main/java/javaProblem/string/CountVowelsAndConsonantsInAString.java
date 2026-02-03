package javaProblem.string;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;


public class CountVowelsAndConsonantsInAString {
    public static void main(String[] args){
        String str = "This is a really simple sentence";
        printVowelAndConsonant(str);
        OptimisedSolution(str); // for larger Dataset
    }

    private static void OptimisedSolution(String str) {
        Set<Character> s = new HashSet<>(Arrays
                .asList('a','e','i','o','u','A','E','I','O','U'));

        int Vcount =0 , Ccount =0;
        for(char c : str.toCharArray()) {
            if (!Character.isLetter(c)) continue;
            else if (s.contains(c)) Vcount++;
            else Ccount++;
        }
        System.out.println(Vcount+" "+Ccount);
    }

    private static void printVowelAndConsonant(String str) {
        int vCount=0,cCount=0;
        str=str.toLowerCase();
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u')
                vCount++;
            else if(str.charAt(i)>='a' && str.charAt(i)<='z')
                cCount++;
        }
        System.out.println(vCount+" "+cCount);
    }
}
