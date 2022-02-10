package javaProblem.string;

public class PermutationString {
    public static void main(String[] args){
        String str = "ABC";
        permutation(str,0,str.length());
    }

    private static void permutation(String str, int start, int end) {
        if(start==end-1)
            System.out.println(str);
        else{
            for(int i=start;i<end;i++){
                str=swap(str,start,i);
                permutation(str,start+1,end);
                str = swap(str,start,i);
            }
        }
    }

    private static String swap(String str, int index, int i) {
        char[] a=str.toCharArray();
        char temp=a[index];
        a[index]=a[i];
        a[i]=temp;
        return String.valueOf(a);
    }
}
