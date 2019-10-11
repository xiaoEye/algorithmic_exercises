package LeetCode.Easy;

import java.util.HashMap;
import java.util.Map;

public class LC70_1 {

    public static void main(String[] args) {
        LC70_1 lc70_1 = new LC70_1();
        System.out.println(lc70_1.climbStairs(20));
    }

    public int climbStairs(int n) {
        if (n <= 2) return n;
        int[] dp = new int[n + 1];

        dp[1] = 1;
        dp[2] = 2;

        for (int i = 3; i < n + 1; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }

        return dp[n];
    }

//    public int climbStairs(int n) {
//        Map<Integer, Integer> map = new HashMap<>();
//        return climb(n, map);
//    }
//
//    private int climb(int n, Map<Integer, Integer> map) {
//        if (n <= 2) return n;
//        if (map.containsKey(n)) {
//            return map.get(n);
//        } else {
//            int result = climb(n - 1, map) + climb(n - 2, map);
//            map.put(n, result);
//            return result;
//        }
//    }
}
