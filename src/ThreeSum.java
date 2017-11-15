import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 给定一个数组
 * 返回所有三个元素相加和为零的组合List
 */
public class ThreeSum {

    public static void main(String[] args) {
        System.out.print(threeSum(new int[]{0,0,0,0}));
    }

    public static List<List<Integer>> threeSum(int[] numbers) {
        List<List<Integer>> result = new ArrayList<>();
        numbers = Arrays.stream(numbers).parallel().sorted().toArray();
        int l, r, sum, target;
        for (int i=0 ; i < numbers.length-2; i++ ) {
            l = i+1;
            r=numbers.length-1;
            target = 0 - numbers[i];;

            if (i > 0 && numbers[i] == numbers[i - 1]) {
                continue;
            }
            while (l<r) {
                if (target ==  numbers[l] + numbers[r]) {
                    result.add(Arrays.asList(numbers[i], numbers[l], numbers[r]));
                    while (l < r && numbers[l] == numbers[l + 1]) {
                        ++l;
                    }
                    while (l < r && numbers[r] == numbers[r - 1]) {
                        --r;
                    }
                    ++l; --r;
                } else if (numbers[l] + numbers[r] < target) {
                    l++;
                } else {
                    r--;
                }
            }
        }
        return result;
    }
}
