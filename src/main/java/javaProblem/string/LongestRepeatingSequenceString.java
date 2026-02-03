package javaProblem.string;

import java.util.Arrays;

public class LongestRepeatingSequenceString {
    public static void main(String[] args){
        String str = "acbdfghybdf";
        int n = str.length();
        String[] suffix = new String[n];
        for (int i =0; i< n; i++) {
            suffix[i] = str.substring(i);
        }
        System.out.println(Arrays.toString(suffix));

        Arrays.sort(suffix);

        System.out.println(Arrays.toString(suffix));

        String result = "";

        for(int i=0; i< n-1; i++) {
            String lcp = commonPrefix(suffix[i],suffix[i+1]);
            if (lcp.length() > result.length()) {
                result = lcp;
            }
        }
        System.out.println(result);
    }

    private static String commonPrefix(String suffix, String suffix1) {
        int len = Math.min(suffix.length(), suffix1.length());
        for (int i=0; i< len; i++) {
            if (suffix.charAt(i) != suffix1.charAt(i)) {
                return suffix.substring(0,i);
            }
        }
        return suffix.substring(0, len);
    }


}
