import java.util.Map;

/**
 * Created by mrzho on 2017/10/18.
 */
public class IntegerToRoman {
    public static void main(String[] args) {
        System.out.print(intToRoman(3009));
    }
    public static String intToRoman(int num) {
        // 罗马数字最大到千，先处理千位
        StringBuilder result = new StringBuilder(appendM("M", num/1000));
        String[][] roman = {
                {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"},
                {"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"},
                {"", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"}
        };
        num = num%1000;
        int j = 100;
        for (int i = 2 ; i >= 0 ; i--) {
            result.append(roman[i][num/j]);
            num = num % j;
            j = j/10;
        }
        return result.toString();
    }

    private static String appendM(String m, int number) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < number ; i++) {
            result.append(m);
        }
        return result.toString();
    }
}
