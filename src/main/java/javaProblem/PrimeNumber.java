package javaProblem;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PrimeNumber {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Integer value = Integer.valueOf(br.readLine());
        System.out.println(isPrime(value));

        // print prime numbers in between 100
        Integer value1 = Integer.valueOf(br.readLine());
        //primeGenerator(value1);

        // print prime numbers upto given count
        primeGeneratorUpToCount(value1);
    }

    private static void primeGeneratorUpToCount(Integer value1) {
        int i=2,count=0;
        while(count<value1){
            boolean flag=false;
            for(int j=2;j<=i/2;j++){
                if(i%j==0){
                    flag=true;
                    break;
                }
            }
            if(flag==false){
                System.out.println(i);
                count++;
            }
            i++;
        }
    }

    private static void  primeGenerator(Integer value1) {
        for(int i=2;i<=value1;i++){
            boolean isPrime = true;
            for(int j=2;j<=i/2;j++){
                if(i%j==0){
                    isPrime=false;
                    break;
                }
            }
            if(isPrime==true)
                System.out.println(i);
        }
    }

    private static boolean isPrime(Integer value) {
        if(value<2)
            return false;
        else if(value == 2)
            return true;
        if(value>2){
            for(int i=2;i<=value/2;i++){
                if(value%i==0){
                    return false;
                }
            }
        }
        return true;
    }
}
