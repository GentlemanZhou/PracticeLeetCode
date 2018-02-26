/**
 * @author Mr.zhou
 *
 * 34. Search for a Range
 * Given an array of integers sorted in ascending order, find the starting and ending position of a given target value.
 * Your algorithm's runtime complexity must be in the order of O(log n).
 * If the target is not found in the array, return [-1, -1].
 *
 * For example,
 * Given [5, 7, 7, 8, 8, 10] and target value 8,
 * return [3, 4].
 */
public class LeetCode34 {

    public static void main(String[] args) {
        System.out.print(searchRange(new int[]{}, 8).toString());
    }

    public static int[] searchRange(int[] numbers, int target) {
        int[] res = {-1, -1};
        if ( numbers == null || numbers.length == 0 ) {
            return res;
        }
        int n = numbers.length;
        int start = 0, end = n-1;
        while (numbers[start] < numbers[end]) {
            int mid = start + (end - start) / 2;
            if (numbers[mid] > target) {
                end = mid - 1;
            }
            else if (numbers[mid] < target) {
                start = mid + 1;
            }
            else {
                if (numbers[start] < target) {
                    start++;
                }
                if (numbers[end] > target) {
                    end--;
                }
            }
        }
        if (numbers[start] == target) {
            res[0] = start;
            res[1] = end;
        }
        return res;
    }

}
