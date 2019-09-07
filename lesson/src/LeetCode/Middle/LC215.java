package LeetCode.Middle;

import java.util.Arrays;

public class LC215 {

    public static void main(String[] args) {
        System.out.println(findKthLargest(new int[]{3, 2, 1, 5, 6, 4}, 2));
        System.out.println(findKthLargest(new int[]{3, 2, 3, 1, 2, 4, 5, 5, 6}, 4));
        System.out.println(findKthLargest(new int[]{1}, 1));
        System.out.println(findKthLargest(new int[]{2, 1}, 1));
        System.out.println(findKthLargest(new int[]{5, 2, 4, 1, 3, 6, 0}, 4));
    }

    public static int findKthLargest(int[] nums, int k) {
        int index = nums.length - k;

        return nums[partition(nums, 0, nums.length - 1, index)];
    }

    private static int partition(int[] nums, int start, int end, int index) {
        if (start >= end && start == index) {
            return start;
        }

        int position = part(nums, start, end);
//        System.out.println(Arrays.toString(nums));
        if (position < index) {
            return partition(nums, position + 1, end, index);
        } else if (position > index) {
            return partition(nums, start, position - 1, index);
        } else {
            return position;
        }
    }

    private static int part(int[] nums, int start, int end) {
        int i = start;
        int choiceNum = nums[end];
        for (int j = start; j < end; j++) {
            if (nums[j] < choiceNum) {
                int tmp = nums[i];
                nums[i] = nums[j];
                nums[j] = tmp;
                ++i;
            }
        }
        int tmp = nums[i];
        nums[i] = nums[end];
        nums[end] = tmp;
        return i;
    }
}
