/**
 * Created by mrzho on 2017/11/22.
 */
public class ImplementStr {
    public static void main(String[] args) {
        System.out.print(strStr("", ""));
    }

    public static int strStr(String haystack, String needle) {
        if (haystack == null || needle == null || haystack =="" || needle == "") {
            return 0;
        }
       int m = haystack.length(), n = needle.length();
        if (m < n) {
            return -1;
        }
        char[] hayChar = haystack.toCharArray(), needChar = needle.toCharArray();
        for (int i=0; i<= m-n; i++) {
            for (int j=0; j<n; j++) {
                if (hayChar[i+j] != needChar[j]) {
                    break;
                }
                if ( j+1 == n ) {
                    return i;
                }
            }
        }
        return -1;
    }
}
