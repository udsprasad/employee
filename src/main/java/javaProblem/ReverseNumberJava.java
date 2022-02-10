package javaProblem;

public class ReverseNumberJava {
    //Reverse a Number in Java
    public static void main(String[] a){
        int i=12345;
        int reverseNumber=0;
        while(i!=0){
            reverseNumber=i%10+reverseNumber*10;
            i=i/10;
        }
        System.out.println(reverseNumber);
    }
}
