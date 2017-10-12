import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static void main(String[] args) {
        int[] numbers = {-3, 4, 3, 90};
        int[] result =  twoSum(numbers, 0);
        System.out.println("结果：" + result[0] + ',' + result[1]);
    }

    public static int[] twoSum(int[] numbers, int target) {
        int[] result = null;
        Map<Integer, Integer> map = new HashMap<>();
        for (int i=0 ; i < numbers.length; i++ ) {
            int complement = target - numbers[i];
            if (map.containsKey(complement)) {
                return new int[] {map.get(complement), i};
            }
            map.put(numbers[i], i);
        }
        return result;
    }
}
