package javaProblem.string;

public class PalindromComplex {

    public static void main(String... args) {
        String s = "A man, a plan, a canal: Panama";
        int start =0, end = s.length()-1;
        boolean flag = true;

        while(start < end) {

            if (Character.isLetterOrDigit(s.charAt(start))) {
                start++;
                continue;
            }

            if (Character.isLetterOrDigit(s.charAt(end))) {
                end--;
                continue;
            }

            if (Character.toLowerCase(s.charAt(start))
                    != Character.toLowerCase(s.charAt(end))) {
                flag = false;
                break;
            }

            start++;
            end--;

        }

        System.out.println(flag);
    }
}
