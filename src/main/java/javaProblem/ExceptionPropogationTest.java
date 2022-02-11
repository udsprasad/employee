package javaProblem;

public class ExceptionPropogationTest {
    public static void main(String[] args){
        int count=0;
        try{
            try{
                System.out.println("inner Try");
                throw new RuntimeException();
            }finally{
                System.out.println("inner finally");
                throw new ArrayIndexOutOfBoundsException();
            }
        } catch(Exception e){
            System.out.println("catch");
            System.out.println(e);
        } finally{

        }
    }
}
