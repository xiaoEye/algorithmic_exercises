package LeetCode.Easy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class LC1 {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(twoSum(new int[]{2, 7, 11, 15}, 9)));
    }

    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }
        for (int i = 0; i < nums.length; i++) {
            int left = target - nums[i];
            if (map.containsKey(left) && map.get(left) != i) {
                return new int[]{i, map.get(left)};
            }
        }
        throw new IllegalArgumentException("No two sum solution");
    }
}
