package javaProblem.string;

public class PermutationWithDuplicate {
    public static void main(String[] args){
        String str = "ABCA";
        permutation(str,0,str.length());
    }

    private static void permutation(String str, int start, int end) {
        if(start==end-1)
            System.out.println(str);
        else{
            for(int i=start;i<end;i++){
                boolean check = shouldSwap(str, start, i);
                if(check) {
                    str = swap(str, start, i);
                    permutation(str, start + 1, end);
                    str = swap(str, start, i);
                }
            }
        }
    }

    private static boolean shouldSwap(String str, int start, int curr) {
        for(int k=start;k<curr;k++){
          if(str.charAt(k) == str.charAt(curr)){
              return false;
          }
        }
        return true;
    }

    private static String swap(String str, int index, int i) {
        char[] a=str.toCharArray();
        char temp=a[index];
        a[index]=a[i];
        a[i]=temp;
        return String.valueOf(a);
    }
}
