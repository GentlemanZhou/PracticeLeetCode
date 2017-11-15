/**
 * Created by mrzho on 2017/10/23.
 */
public class LongestPalindromicSubstring {
    // 解法1
    public String longestPalindrome1(String s) {
        int start = 0, end = 0;
        for (int i = 0; i < s.length(); i++) {
            int len1 = expandAroundCenter(s, i, i);
            int len2 = expandAroundCenter(s, i, i + 1);
            int len = Math.max(len1, len2);
            if (len > end - start) {
                start = i - (len - 1) / 2;
                end = i + len / 2;
            }
        }
        return s.substring(start, end + 1);
    }

    private int expandAroundCenter(String s, int left, int right) {
        int L = left, R = right;
        while (L >= 0 && R < s.length() && s.charAt(L) == s.charAt(R)) {
            L--;
            R++;
        }
        return R - L - 1;
    }

    // 解法2
    char[] ss;
    int left=0, max=1;
    public String longestPalindrome(String s) {
        ss=s.toCharArray();
        if(ss.length<1) return "";
        for(int i=0; i<ss.length; i++){
            i=update(i);
        }
        return s.substring(left, left+max);
    }
    private int update(int index){
        int ll=index, rr=index;
        while(rr+1<ss.length && ss[rr]==ss[rr+1]){
            rr++;
        }
        int temp=rr;
        while(rr+1<ss.length && ll-1>=0 && ss[rr+1]==ss[ll-1]){
            rr++;
            ll--;
        }
        if(rr-ll+1>max){
            max=rr-ll+1;
            left=ll;
        }
        return temp;
    }
}
