/**
 * Created by mrzho on 2017/11/8.
 */
public class RegularExpressionMatching {
    public static void main(String[] args) {
        System.out.print(isMatch("aab", "c*a*b"));
    }
    public static boolean isMatch(String s, String p) {
        if (p.isEmpty()) return s.isEmpty();
        boolean firstMatch = (!s.isEmpty()) && (s.charAt(0)==p.charAt(0) || p.charAt(0)=='.');
        if (p.length() >= 2 && p.charAt(1) == '*' ) {
            return (isMatch(s, p.substring(2))) || (firstMatch && isMatch(s.substring(1), p));
        } else {
            return firstMatch && isMatch(s.substring(1), p.substring(1));
        }
    }

    public boolean isMatch1(String s, String p) {
        boolean[] match = new boolean[s.length()+1];
        for(int i=0; i<match.length; i++){
            match[i] = false;
        }
        match[s.length()] = true;
        for(int i=p.length()-1; i>=0; i--){
            if(p.charAt(i)=='*'){
                for(int j=s.length()-1; j>=0; j--){
                    match[j] = match[j]||match[j+1]&&(p.charAt(i-1)=='.'||p.charAt(i-1)==s.charAt(j));
                }
                i--;
            }else {
                for(int j=0; j<s.length(); j++){
                    match[j] = match[j+1]&&(p.charAt(i)=='.'||p.charAt(i)==s.charAt(j));
                }
                match[s.length()] = false;
            }
        }

        return match[0];
    }
}
