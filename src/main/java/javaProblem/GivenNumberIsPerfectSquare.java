package javaProblem;

public class GivenNumberIsPerfectSquare {
    //if a Given Number is Perfect Square
    public static void main(String[] a){
        System.out.println(prefectSquare(25));
    }
     //In the method, we have calculated the square root of the number by the Math.sqrt() method
     // and store it in a variable named sqrt.
     // After that, we have found the floor value of the calculated square root by the Math.floor() method.
     // Along with this, we have found the difference between the two sqrt and floor value.
     // The resultant of the difference compared with 0 and returns a Boolean value.
    private static boolean prefectSquare(int value) {
        double sqrt = Math.sqrt(value);
        if(sqrt-Math.floor(sqrt)==0)
            return true;
        return false;
    }
}
