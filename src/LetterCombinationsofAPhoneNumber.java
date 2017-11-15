import java.util.ArrayList;
import java.util.List;

/**
 * Given a digit string, return all possible letter combinations that the number could represent.
 * A mapping of digit to letters (just like on the telephone buttons) is given below.
 * Input:Digit string "23"
 * Output: ["ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf"].
 */
public class LetterCombinationsofAPhoneNumber {

    private static String[] s = {"", " ", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};

    public List<String> letterCombinations(String digits) {
        //2.Create a arraylist to return results
        ArrayList<String> results = new ArrayList<>();

        //3.Corner case check
        if(digits == null || digits.length() == 0) {
            return results;
        }
        //4.Call recursive method
        combination(digits, "", results, 0);
        return results;
    }

    private void combination(String digits, String prefix, ArrayList<String> results, int i) {
        //5.If index get to end of String digits, add result to arraylist results
        if(i == digits.length()) {
            results.add(prefix);
        } else {
            //6.Convert number to every possible character
            int num = digits.charAt(i) - '0';
            String letter = s[num];
            char[] ch = letter.toCharArray();
            //7.For every possible letter, add it with prefix
            for(char c : ch) {
                combination(digits, prefix + c, results, i + 1);
            }

        }
    }
}
