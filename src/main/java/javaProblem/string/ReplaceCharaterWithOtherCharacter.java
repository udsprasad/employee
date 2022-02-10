package javaProblem.string;

public class ReplaceCharaterWithOtherCharacter {
    public static void main(String[] args){
        String string = "Once in a blue moon";
        char ch = '-';
        string = string.replace(' ',ch);
        System.out.println(string);
    }
}
