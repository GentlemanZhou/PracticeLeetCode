/**
 * Created by mrzho on 2017/10/12.
 */
public class CountAndSay {

    public static void main(String[] args) {
        int i = 0;
        System.out.print(countAndSay(i));
    }

    public static String countAndSay(int n) {
        String result = "1";
        int i = 1;
        while (i < n) {
            result = countOnce(result);
            i++;
        }
        return result;
    }

    private static String countOnce(String param) {
        StringBuilder result = new StringBuilder();
        int num = 0;
        char aChar ;
        for (int i=0 ;i < param.length() ; i++) {
            num ++;
            aChar  = param.charAt(i);
            if ( !( param.length() > i+1 && aChar == param.charAt(i+1) ) ) {
                result.append(num).append(aChar);
                num = 0;
            }
        }
        return result.toString();
    }
}
