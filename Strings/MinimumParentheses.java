import java.util.*;

public class MinimumParentheses {
    public static int minimumParentheses(String pattern) {
        int leftCount = 0;
        int rightCount = 0;

        for (int i = 0; i < pattern.length(); i++) {
            char ch = pattern.charAt(i);
            if (ch == '(') {
                leftCount++;
            } else {
                if (leftCount > 0) {
                    leftCount--;
                } else {
                    rightCount++;
                }
            }
        }
        return leftCount + rightCount;
    }

    public static void main(String[] args) {
        String pattern = "(()";
        System.out.println(minimumParentheses(pattern)); // Output: 1
    }
}