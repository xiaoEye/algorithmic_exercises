package LeetCode.Middle;

import java.util.Arrays;

public class LC213 {

    public static void main(String[] args) {
        System.out.println(rob(new int[]{1, 2, 3}));
    }

    public static int rob(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        if (nums.length == 1) return nums[0];
        return Math.max(robMoney(Arrays.copyOfRange(nums, 0, nums.length - 1)),
                robMoney(Arrays.copyOfRange(nums, 1, nums.length)));
    }

    public static int robMoney(int[] nums) {
        int[] dp = new int[nums.length + 1];
        dp[1] = nums[0];
        for (int i = 2; i < nums.length + 1; i++) {
            dp[i] = Math.max(dp[i - 1], dp[i - 2] + nums[i - 1]);
        }
        return dp[nums.length];
    }
}
