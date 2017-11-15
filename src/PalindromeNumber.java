/**
 * Created by mrzho on 2017/11/8.
 */
public class PalindromeNumber {
    public static void main(String[] args) {
        System.out.print(isPalindrome(-2147447412));
    }
    public static boolean isPalindrome(int x) {

        int palindrome = 0;
        int origin = x;
        // get the palindrome
        while(x > 0) {
            palindrome = palindrome * 10 + x % 10;
            x /= 10;
        }
        return palindrome == origin ;
    }

}
