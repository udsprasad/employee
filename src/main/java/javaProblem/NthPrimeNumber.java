package javaProblem;

public class NthPrimeNumber {
    public static void main(String[] a){
        nthPrimeNumber(2);
    }

    private static void nthPrimeNumber(int value) {
        int j=2,count=0,prime=0;
        while(count<=value){
            boolean flag=true;
            for(int i=2;i<=j/2;i++){
                if(j%i==0){
                    flag=false;
                    break;
                }
            }
            if(flag==true){
                count++;
                if(count==value){
                    prime=j;
                }
            }
            j++;
        }
        System.out.println(prime);
    }
}
