package LeetCode.Easy;

public class LC198 {

    public static void main(String[] args) {
        LC198 lc198 = new LC198();
        System.out.println(lc198.rob(new int[]{1, 2, 3, 1}));
    }

    public int rob(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        if (nums.length == 1) return nums[0];

        int[] dp = new int[nums.length + 1];

        dp[1] = nums[0];
        for (int i = 2; i < nums.length + 1; i++) {
            dp[i] = Math.max(dp[i - 1], dp[i - 2] + nums[i - 1]);
        }

        return dp[nums.length];
    }
}
