import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Stream;

public class LongestCommonPrefix {
    public static void main(String[] args) {
       System.out.print(longestCommonPrefix(new String[] {"a","ab"}));
    }

    public static String longestCommonPrefix(String[] strs) {
        if(strs == null || strs.length == 0) {
            return "";
        }
        String prefix = strs[0];
        if(strs.length == 1) {
            return prefix;
        }
        for(int i=1; i<strs.length; i++) {
            while(strs[i].indexOf(prefix)!=0) {
                prefix = prefix.substring(0,prefix.length()-1);
            }
        }
        return prefix;
    }

}
