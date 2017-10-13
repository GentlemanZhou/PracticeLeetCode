public class ReverseInteger {
    public static void main(String[] args) {
        int x = -1000003;
        System.out.print(reverse1(x));
    }
    public static int reverse(int x) {
        if (x == 0) return 0;
        int res = 0;
        int sign = 1;
        if (x < 0) {
            sign = -1;
            x = -1 * x;
        }
        while (x != 0) {
            if (res > (Integer.MAX_VALUE - x % 10) / 10) {
                return 0;
            }
            res = res * 10 + x % 10;
            x = x / 10;
        }
        return res * sign;
    }

    public static int reverse1(int x) {
        int reverse = 0;
        while(x != 0) {
            int temp = 10 * reverse + x % 10;
            if(temp / 10 != reverse) return 0;
            reverse = temp;
            x /= 10;
        }
        return reverse;
    }
}
