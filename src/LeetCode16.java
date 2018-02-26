import java.util.Arrays;

/**
 * @author Mr.zhou
 *  3Sum Closest
 *  Given an array S of n integers, find three integers in S such that the sum is closest to a given numbersber, target.
 *  Return the sum of the three integers. You may assume that each input would have exactly one solution.
 *
 *  For example, given array S = {-1 2 1 -4}, and target = 1.
 *  The sum that is closest to the target is 2. (-1 + 2 + 1 = 2).
 */
public class LeetCode16 {
    public static void main(String[] args) {
        System.out.println(threeSumClosest(new int[]{-1,2,1,-4}, -4));
    }

    public static int threeSumClosest(int[] numbers, int target) {
        if (numbers == null || numbers.length < 3) {
            return 0;
        }
        Arrays.sort(numbers);
        int ret = 0;
        int closestDist = Integer.MAX_VALUE;
        int len =  numbers.length;
        for (int i = 0; i < len-2; i++) {
            if (i > 0 && numbers[i] == numbers[i-1]) {
                continue;
            }

            int l = i+1, r = len-1;
            while (l < r) {
                int sum = numbers[i] + numbers[l] + numbers[r];
                if (sum < target) {
                    if (target-sum < closestDist) {
                        closestDist = target - sum;
                        ret = sum;
                    }
                    l++;
                } else if (sum > target) {
                    if (sum-target < closestDist) {
                        closestDist = sum - target;
                        ret = sum;
                    }
                    r--;
                } else { //when sum == target, return sum.
                    return sum;
                }
            }
        }
        return ret;
    }
}
