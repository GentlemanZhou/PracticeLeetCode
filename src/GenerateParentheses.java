import java.util.ArrayList;
import java.util.List;

/**
 * Given n pairs of parentheses, write a function to generate all combinations of well-formed parentheses.

 * For example, given n = 3, a solution set is:

 [
 "((()))",
 "(()())",
 "(())()",
 "()(())",
 "()()()"
 ]
 */
public class GenerateParentheses {
    public static void main(String[] args) {
        System.out.println(generateParenthesis(3));
    }
    public static List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        StringBuilder oneRow = new StringBuilder();
        helper(n, n, oneRow, result);
        return result;
    }
    static void helper(int left, int right, StringBuilder out, List<String> result) {
        if (left < 0 || right < 0 || left > right) {
            return;
        }
        if (left == 0 && right == 0) {
            result.add(out.toString());
            return;
        }
        helper(left - 1, right, out.append("("), result);
        out.setLength(out.length() -1);
        helper(left, right - 1, out.append(")"), result);
        out.setLength(out.length() -1);
    }
}
