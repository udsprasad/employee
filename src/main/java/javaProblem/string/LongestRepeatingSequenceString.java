package javaProblem.string;

public class LongestRepeatingSequenceString {
    public static void main(String[] args){
        String str = "acbdfghybdf";
        String lrs="";
        int n = str.length();
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                String x = lps(str.substring(i,n),str.substring(j,n));
                System.out.println(str.substring(i,n)+ " "+str.substring(j,n)+" "+x);
                if(x.length()>lrs.length())
                    lrs=x;
            }
        }
        System.out.println(lrs);
    }

    private static String lps(String s, String s1) {
        int n= Math.min(s.length(),s1.length());
        for(int i=0;i<n;i++){
            if(s.charAt(i)!=s1.charAt(i)){
                return s.substring(0,i);
            }
        }
        return s.substring(0,n);
    }
}
