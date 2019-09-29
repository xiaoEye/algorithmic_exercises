package LeetCode.Easy;

import java.util.HashMap;

public class LC1_1 {

    public static void main(String[] args) {

    }

    public int[] twoSum(int[] nums, int target) {
        int length = nums.length;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < length; i++) {
            map.put(target - nums[i], i);
        }
        for (int i = 0; i < length; i++) {
            if (map.containsKey(nums[i]) && i != map.get(nums[i])) {
                return new int[]{i, map.get(nums[i])};
            }
        }
        throw new RuntimeException("not found");
    }
}
