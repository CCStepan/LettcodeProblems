package RemoveOutermostParentheses;

import java.lang.reflect.Array;
import java.util.Stack;
import java.util.Stack;

public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.removeOuterParentheses("(()())(())(()(()))"));
    }

    public String removeOuterParentheses(String s) {
        StringBuilder sb = new StringBuilder();
        int opened = 0;
        for (char c : s.toCharArray()) {

            if (c == '(' && opened++ > 0) {
                sb.append(c);

            }
            if (c == ')' && opened-- > 1) {
                sb.append(c);

            }
        }
        return sb.toString();
    }
}


