package LeetCode.Middle;

import java.util.*;

public class LC15 {

    public static void main(String[] args) {
        // -4, -1, -1, 0, 1, 2
        System.out.println(threeSum(new int[]{-1, 0, 1, 2, -1, -4}));
    }

    public static List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        Set<List<Integer>> sets = new HashSet<>();
        int length = nums.length;

        for (int i = 0; i < length; i++) {
            if (nums[i] > 0) {
                break;
            }
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            int start = i + 1;
            int end = nums.length - 1;
            while (start < end) {
                if (nums[start] + nums[end] + nums[i] < 0) {
                    start++;
                } else if (nums[start] + nums[end] + nums[i] > 0) {
                    end--;
                } else {
                    List<Integer> list = new ArrayList<Integer>();
                    list.add(nums[i]);
                    list.add(nums[start++]);
                    list.add(nums[end--]);
                    Collections.sort(list);
                    sets.add(list);
                }
            }
        }

        ArrayList<List<Integer>> lists = new ArrayList<>(sets);
        return lists;
    }
}
