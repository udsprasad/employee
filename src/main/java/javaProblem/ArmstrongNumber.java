package javaProblem;

public class ArmstrongNumber {
    public static void main(String[] a){
        System.out.println(isArmstrong(1534));
    }

    private static boolean isArmstrong(int i) {
        int sum =0,actualValue=i;
        int digits=Integer.toString(i).length();
        System.out.println(digits);
        while(i>0){
            sum= (int) (sum+Math.pow(i%10,digits));
            i= i/10;
        }
        if(sum==actualValue)
            return true;
        return false;
    }
}
