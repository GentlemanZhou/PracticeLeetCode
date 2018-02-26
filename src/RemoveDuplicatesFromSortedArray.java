/**
 * Created by mrzho on 2017/11/21.
 */
public class RemoveDuplicatesFromSortedArray {

    public static void main(String[] args) {
        System.out.println(removeDuplicates(new int[]{1,2,4,5,5,6,8,9}));
    }

    public static int removeDuplicates(int[] nums) {
        int result = 0;
        if (nums == null || nums.length == 0) {
            return result;
        }
        result ++;
        for (int i=1; i < nums.length; i++) {
            if (nums[i] != nums[i-1]) {
                nums[result]=nums[i];
                result++;
            }
        }
        return result;
    }
}
