package javaProblem.pattern;

public class Pattern1 {
    //5432*
    //543*1
    //54*21
    //5*321
    //*4321
    public static void main(String[] args){
        int value=7;
        for(int i=1; i<=value;i++){
            for(int j=value;j>0;j--){
                if(i==j){
                    System.out.print("*");
                } else {
                    System.out.print(j);
                }
            }
            System.out.println();
        }
    }
}
