public class DivideTwoIntegers {

    public static void main(String[] args) {
        System.out.print(divide(-100, -1));
    }
    public static int divide(int dividend, int divisor) {
        if (divisor == 0 ||  (dividend == Integer.MIN_VALUE && divisor == -1)) return Integer.MAX_VALUE;
        boolean status =  (dividend^divisor)>>>31 == 1;
        dividend = Math.abs(dividend);
        divisor = Math.abs(divisor);
        int digit = 0 ,result =0;
        while(divisor <= (dividend>>1))
        {
            divisor <<= 1;
            digit++;
        }
        while(digit>=0)
        {
            if(dividend>=divisor)
            {
                result += 1<<digit;
                dividend -= divisor;
            }
            divisor >>= 1;
            digit--;
        }
        return status?-result:result;
    }
}
