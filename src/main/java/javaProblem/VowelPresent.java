package javaProblem;

import java.util.Locale;

public class VowelPresent {
    // Java Program to check if a vowel is present in the string?
    public static void main(String[] args){
        String name ="remgoprl";
        System.out.println(containsMethod(name));
        System.out.println(matchesMethod(name));
    }

    private static boolean matchesMethod(String name) {
        if(name.toLowerCase().matches(".*[aeiou].*"))
            return true;
        return false;
    }

    private static boolean containsMethod(String name) {
        boolean contain = false;
        if(name.toLowerCase().contains("a")||name.contains("e")){
            contain = true;
        }
        return contain;
    }
}
