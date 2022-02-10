package javaProblem.string;

public class LargestAndSmallestWordString {
    public static void main(String[] args){
        String string= "Hardships often prepare ordinary people for an extraordinary destinyaaaaaaaa";
        int min=Integer.MAX_VALUE,max = 0;
        String minWord=null,maxWord=null;
        for(String s:string.split(" ")){
            if(s.length()>max){
                max=s.length();
                maxWord=s;
            } else if(s.length()<min){
                min=s.length();
                minWord=s;
            }
        }
        System.out.println(minWord + "   :   "+maxWord);
    }
}
