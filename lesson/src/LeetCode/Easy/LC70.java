package LeetCode.Easy;

import java.util.HashMap;
import java.util.Map;

public class LC70 {

    private static Map<Integer, Integer> map = new HashMap<>();

    public static void main(String[] args) {
        System.out.println(climbStairs(44));
    }

    public static int climbStairs(int n) {
        if (n == 1) {
            return 1;
        }
        if (n == 2) {
            return 2;
        }

        if (map.containsKey(n)) {
            return map.get(n);
        }

        int num1 = climbStairs(n - 1);
        int num2 = climbStairs(n - 2);
        if (!map.containsKey(n - 1)) {
            map.put(n - 1, num1);
        }
        if (!map.containsKey(n - 2)) {
            map.put(n - 2, num1);
        }

        return num1 + num2;
    }
}
