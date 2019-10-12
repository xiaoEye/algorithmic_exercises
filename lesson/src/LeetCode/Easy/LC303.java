package LeetCode.Easy;

import java.util.Arrays;

public class LC303 {

    public static void main(String[] args) {
        LC303 lc303 = new LC303(new int[]{1, 2, 3});
        lc303.sumRange(0, 2);
    }

    private static int[] sums;

    public LC303(int[] nums) {
        sums = new int[nums.length + 1];

        sums[0] = 0;
        for (int i = 1; i < nums.length + 1; i++) {
            sums[i] = sums[i - 1] + nums[i - 1];
        }
        System.out.println(Arrays.toString(sums));
    }

    public int sumRange(int i, int j) {
        return sums[j + 1] - sums[i];
    }
}
