package javaProblem;

public class FactorialProgram {
    public static void main(String[] a){
        System.out.println(factorial(3));
        System.out.println(factorialWithFor(3));
    }

    private static int factorialWithFor(int i) {
        int factorial=1;
        if(i<=1){
            return 1;
        } else {
            for (int j = 1; j <=i;j++){
                factorial=factorial*j;
            }

        }
        return factorial;
    }

    private static int factorial(int i) {
        if(i<=1)
            return 1;
        return i*factorial(i-1);
    }
}
