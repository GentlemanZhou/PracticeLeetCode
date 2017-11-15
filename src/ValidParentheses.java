import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 * Created by mrzho on 2017/11/14.
 */
public class ValidParentheses {
    public static void main(String[] args) {
        System.out.print(isValid("()"));
    }


    public static boolean isValid(String s) {
        if (s == null || s.length() == 0) {
            return true;
        }
        Map<Character, Character> map = new HashMap<Character, Character>();
        map.put('(',')');
        map.put('[',']');
        map.put('{','}');
        char[] chars = s.toCharArray();
        System.out.print(chars.length);
        Stack<Character> stk = new Stack<>();
        for (int i=0 ; i < chars.length; i++) {
            switch (chars[i]) {
                case '(':case '[':case '{' :
                    stk.push(chars[i]);
                    break;
                case ')':case ']':case '}' :
                    if (stk.isEmpty() || chars[i] != map.get(stk.pop())) {
                        return false;
                    }
            }
        }
        return stk.isEmpty();
    }

}
