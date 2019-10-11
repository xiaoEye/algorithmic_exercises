package LeetCode.Middle;

import java.util.Arrays;

public class LC64 {

    public static void main(String[] args) {
        int[][] aaa = new int[][]{{1, 3, 1}, {1, 5, 1}, {4, 2, 1}};
        System.out.println(minPathSum(aaa));
    }

    public static int minPathSum(int[][] grid) {
        int[][] dp = new int[grid.length + 1][grid[0].length + 1];
        dp[1][1] = grid[0][0];
        for (int i = 1; i < grid.length + 1; i++) {
            for (int j = 1; j < grid[0].length + 1; j++) {
                if (i != 1 && j != 1) {
                    dp[i][j] = Math.min(dp[i][j - 1], dp[i - 1][j]) + grid[i - 1][j - 1];
                }
                if (i == 1) {
                    dp[i][j] = dp[i][j - 1] + grid[i - 1][j - 1];
                }
                if (j == 1) {
                    dp[i][j] = dp[i - 1][j] + grid[i - 1][j - 1];
                }
            }
        }
        return dp[grid.length][grid[0].length];
    }
}
