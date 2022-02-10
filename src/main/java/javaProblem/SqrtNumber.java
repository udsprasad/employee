package javaProblem;

public class SqrtNumber {
    //sqrtn+1=(sqrtn+(num/sqrtn))/2.0
    public static void main(String[] a){
        System.out.println(sqrt(25));
    }

    private static float sqrt(int i) {
        int value =0,sqrt=i/2,temp;
        do{
           temp=sqrt;
           sqrt=(temp+(i/temp))/2;
        }while(temp-sqrt!=0);
        return sqrt;
    }
}
