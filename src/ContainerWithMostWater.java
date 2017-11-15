public class ContainerWithMostWater {
    public static void main(String[] args) {
        System.out.print(maxArea(new int[]{1,2,3,4,5}));
    }

    public static int maxArea(int[] height) {
        if (height == null || height.length<1) {
            return 0;
        }
        int left = 0, right = height.length - 1, result = 0, minH;
        while (left < right) {
            minH = Math.min(height[left], height[right]);
           result = Math.max(result, minH * (right - left));
           while (left < height.length && height[left]<= minH) { left ++; }
           while (right > 0 && height[right] <= minH) { right --; }
        }
        return result;
    }
}
