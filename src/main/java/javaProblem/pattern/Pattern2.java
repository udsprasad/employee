package javaProblem.pattern;

public class Pattern2 {
    //*000*000*
    //0*00*00*0
    //00*0*0*00
    //000***000
    public static void main(String[] args){
        for(int i=1;i<=4;i++){
            for(int j=1;j<=4;j++){
                if(i==j) {
                    System.out.print("*");
                } else {
                    System.out.print("0");
                }
            }
            System.out.print("*");
            for(int k=4;k>=1;k--){
                if(i==k) {
                    System.out.print("*");
                } else {
                    System.out.print("0");
                }
            }
            System.out.println();
        }
    }
}
