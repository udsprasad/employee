package javaProblem;

public class FibonacciSeries {
    static int a=0,b=1,c=0;

    public static void main(String[] a){
      // without using recursion
        //withOutRecursion(10);
        for(int i=0;i<10;i++) {
            System.out.println(withRecursion(i));
        }
    }

    private static int withRecursion(int value) {
        if(value<=1)
            return value;
        return withRecursion(value-1)+withRecursion(value-2);
    }

    private static void withOutRecursion(int value) {
        for(int i=1;i<=value;i++){
            System.out.println(a);
            c=a+b;
            a=b;
            b=c;
        }
    }
}
