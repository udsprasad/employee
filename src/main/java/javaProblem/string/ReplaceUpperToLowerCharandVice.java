package javaProblem.string;

public class ReplaceUpperToLowerCharandVice {
    public static void main(String[] args){
        String str="Great Power";
        char[] array= new char[str.length()];
        int k=0;
        for(char c: str.toCharArray()){
            if(Character.isLowerCase(c)) {
                array[k++]=Character.toUpperCase(c);
            } else {
                array[k++]=Character.toLowerCase(c);
            }
        }
        System.out.println(new String(array));
    }
}
