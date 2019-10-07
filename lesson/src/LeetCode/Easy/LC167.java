package LeetCode.Easy;

import java.util.HashMap;
import java.util.Map;

public class LC167 {

    public static void main(String[] args) {

    }

    public int[] twoSum(int[] numbers, int target) {
        int i = 0, j = numbers.length - 1;
        while (i < j) {
            int sum = numbers[i] + numbers[j];
            if (sum == target) {
                return new int[]{i + 1, j + 1};
            } else if (sum < target) {
                i++;
            } else {
                j--;
            }
        }
        return null;
    }

//    public int[] twoSum(int[] numbers, int target) {
//        Map<Integer, Integer> map = new HashMap<>();
//        for (int i = 0; i < numbers.length; i++) {
//            map.put(target - numbers[i], i + 1);
//        }
//
//        for (int i = 0; i < numbers.length; i++) {
//            if (map.containsKey(numbers[i])) {
//                return new int[]{i + 1, map.get(numbers[i])};
//            }
//        }
//
//        return null;
//    }
}
