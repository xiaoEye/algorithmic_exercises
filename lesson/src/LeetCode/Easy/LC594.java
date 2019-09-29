package LeetCode.Easy;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class LC594 {

    public static void main(String[] args) {
        System.out.println(findLHS(new int[]{1, 3, 5, 7, 9, 11, 13, 15, 17}));
    }

    public static int findLHS(int[] nums) {
        if (nums.length == 0) return 0;
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (!map.containsKey(nums[i])) {
                map.put(nums[i], 1);
            } else {
                map.put(nums[i], map.get(nums[i]) + 1);
            }
        }
        int max = 0;
        for (int num : map.keySet()) {
            if (map.containsKey(num + 1)) {
                max = Math.max(map.get(num) + map.get(num + 1), max);
            }
        }
        return max;
    }
}
