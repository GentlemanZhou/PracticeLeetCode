/**
 * @author Mr.zhou
 */
public class LeetCode35 {

    public static void main(String[] args) {
        System.out.print(searchInsert(new int[]{1,3,5,6}, 0));
    }

    public static int searchInsert(int[] numbers, int target) {
        int start = 0;
        int end = numbers.length-1;
        while(start<=end) {
            int mid = start + (end-start) / 2;
            if(numbers[mid]<target) {
                start = mid + 1;
            } else if(numbers[mid]>target) {
                end = mid - 1;
            } else {
                return mid;
            }
        }
        return start;
    }


}
