package LeetCode.Middle;

import java.util.Arrays;

public class LC322 {

    public static void main(String[] args) {
        System.out.println(coinChange(new int[]{1, 2, 5}, 11));
        System.out.println(coinChange(new int[]{2}, 3));
    }

    public static int coinChange(int[] coins, int amount) {
        if (coins == null || coins.length == 0) return 0;

        int[] dp = new int[amount + 1];
        Arrays.fill(dp, amount + 1);
        dp[0] = 0;
        for (int i = 0; i <= coins.length - 1; i++) {
            int coin = coins[i];
            for (int j = coin; j <= amount; j++) {
                dp[j] = Math.min(dp[j - coin] + 1, dp[j]);
            }
        }
        return dp[amount] > amount ? -1 : dp[amount];
    }
}
