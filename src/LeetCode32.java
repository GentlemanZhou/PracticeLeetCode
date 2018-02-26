/**
 * Created by mrzho on 2017/11/29.
 */
public class LeetCode32 {

    public int longestValidParentheses(String s) {
        char[] chars = s.toCharArray();
        int len = chars.length;
        if (len < 2) {
            return 0;
        }
        int[] counters = new int[len+1];
        int c = 0;
        counters[0] = -1;
        int max = 0;
        int i = 0;
        while(i < len) {
            if ('(' == chars[i]) {
                c = c + 1;
                counters[c] = i;
                i = i +1;
                continue;

            }
            if (c > 0) {
                c = c - 1;
                int m = i - counters[c];
                if(m > max) {
                    max = m;
                }
                i = i +1;
                continue;
            }
            counters[0] = i;
            i = i +1;
        }
        return max;
    }
}
