public class StringToInteger {
    public static void main(String[] args) {
        System.out.print(myAtoi("-00223a"));
    }

    public static int myAtoi(String str) {
        if (str == null || str.length()==0) return 0;
        str = str.trim();
        boolean status = true;
        int i = 0;
        if (str.charAt(0) == '+') {
            i++;
        } else if (str.charAt(0) == '-') {
            i++;
            status = false;
        }
        Double result = 0.0;
        for (; i<str.length(); i++){
            int digit = str.charAt(i) - '0';

            if (digit < 0 || digit > 9) break;

            // 5. handle min & max
            if (status) {
                result = 10*result + digit;
                if (result > Integer.MAX_VALUE) return Integer.MAX_VALUE;
            } else {
                result = 10*result - digit;
                if (result < Integer.MIN_VALUE) return Integer.MIN_VALUE;
            }
        }
        return result.intValue();
    }
}
