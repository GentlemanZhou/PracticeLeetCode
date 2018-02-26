/**
 * Implement next permutation, which rearranges numbers into the lexicographically next greater permutation of numbers.

 * If such arrangement is not possible, it must rearrange it as the lowest possible order (ie, sorted in ascending order).

 * The replacement must be in-place, do not allocate extra memory.

 * Here are some examples. Inputs are in the left-hand column and its corresponding outputs are in the right-hand column.
 * 1,2,3 → 1,3,2
 * 3,2,1 → 1,2,3
 * 1,1,5 → 1,5,1
 */

public class LeetCode31 {


    public void nextPermutation(int[] nums) {
        if(nums == null || nums.length <= 1){
            return;
        }
        int i=nums.length-1;
        for(;i>0;i--) {
            if(nums[i-1] < nums[i]) {
                break;
            }
        }


        // already last one
        if(i == 0){
            reverse(nums, 0, nums.length-1);
            return;
        }

        int j = nums.length - 1;
        while(nums[j] <= nums[i-1]) {
            j--;
        }
        swap(nums, i-1, j);

        reverse(nums, i, nums.length-1);
    }

    private void reverse(int[] n, int from, int to){
        while(from < to) {
            swap(n, from++, to--);
        }
    }

    private void swap(int[] n, int a, int b){
        int temp = n[a];
        n[a] = n[b];
        n[b] = temp;
    }
}
