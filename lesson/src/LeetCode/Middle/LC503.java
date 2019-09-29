package LeetCode.Middle;

import java.util.Arrays;

public class LC503 {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(nextGreaterElements(new int[]{1, 2, 1})));
    }

    public static int[] nextGreaterElements(int[] nums) {
        int length = nums.length;
        int[] result = new int[length];

        for (int i = 0; i < length; i++) {
            for (int j = i; j < i + length; j++) {
                if (nums[i] < nums[j % length]) {
                    result[i] = nums[j % length];
                    break;
                }
                if (j == i + length - 1) {
                    result[i] = -1;
                }
            }
        }
        return result;
    }
}
