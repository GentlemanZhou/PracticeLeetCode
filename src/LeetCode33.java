
public class LeetCode33 {


    public int search(int[] nums, int target) {
        if (nums == null || nums.length == 0) {
            return -1;
        }
        int left = 0, right = nums.length-1;
        while (left<=right) {
            int m = (left+right)/2;
            if(target == nums[m]) {
                return m;
            }
            if(nums[m]<nums[right])
            {
                if(target>nums[m] && target<=nums[right]) {
                    left = m + 1;
                }
                else {
                    right = m - 1;
                }
            }
            else
            {
                if(target>=nums[left] && target<nums[m]) {
                    right = m - 1;
                }
                else {
                    left = m + 1;
                }
            }
        }
        return -1;
    }
}
