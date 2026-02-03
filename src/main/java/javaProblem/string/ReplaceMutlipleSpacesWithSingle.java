package javaProblem.string;

public class ReplaceMutlipleSpacesWithSingle {

    public static void main(String[] args) {
        String s = "Java   is    fun";
        StringBuilder sb = new StringBuilder();
        boolean prevSpace = false;

        for (char c : s.toCharArray()) {
            if (c == ' ') {
                if (!prevSpace) {
                    sb.append(c);
                    prevSpace = true;
                }
            } else {
                sb.append(c);
                prevSpace = false;
            }
        }

        System.out.println(sb.toString());
    }
}
