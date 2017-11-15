public class MedianOfTwoSortedArrays {
    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3};
        int[] nums2 = {5, 6, 7, 8};
        System.out.print(findMedianSortedArrays(nums1, nums2));
    }


    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int num = nums1.length+ nums2.length;
        Integer a = null, b = null;
        int m, n ;
        int num1I = 0, num2I =0;
        if (num % 2 == 1) {
            m = n = (num/2);
        } else {
            m = num/2;
            n = m - 1;
        }
        for (int i=0 ; i< num ; i++) {
            if (num2I >= nums2.length || num1I != nums1.length && nums1[num1I] < nums2[num2I]) {
                if (i == m) {
                    a = nums1[num1I];
                }
                if ( i == n){
                    b = nums1[num1I];
                }
                num1I ++;
            } else {
                if (i == m) {
                    a = nums2[num2I];
                }
                if ( i == n){
                    b = nums2[num2I];
                }
                num2I ++;
            }
            if ( a != null && b !=null) {
                return  (double)(a+b)/2;
            }
        }
        return 0;
    }
}
