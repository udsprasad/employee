package javaProblem.convertfromonetoanotherdatatype;

public class String2Int {
    public static void main(String[] args){
        String string="200";

        //by Integer Class
        int i = Integer.parseInt(string);
        System.out.println(i);

        Integer integer =Integer.valueOf(string);
        System.out.println(integer);
    }
}
