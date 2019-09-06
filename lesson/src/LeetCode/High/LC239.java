package LeetCode.High;

import java.util.*;

public class LC239 {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(maxSlidingWindow(new int[]{1, 3, -1, -3, 5, 3, 6, 7}, 3)));
        System.out.println(Integer.MIN_VALUE);
    }

    public static int[] maxSlidingWindow(int[] nums, int k) {
        int n = nums.length;
        if (n * k == 0) return new int[0];

        int[] output = new int[n - k + 1];
        for (int i = 0; i < n - k + 1; i++) {
            int max = Integer.MIN_VALUE;
            for (int j = i; j < i + k; j++)
                max = Math.max(max, nums[j]);
            output[i] = max;
        }
        return output;
    }
}

//class Solution {
//    ArrayDeque<Integer> deq = new ArrayDeque<Integer>();
//    int[] nums;
//
//    public void clean_deque(int i, int k) {
//        // remove indexes of elements not from sliding window
//        if (!deq.isEmpty() && deq.getFirst() == i - k)
//            deq.removeFirst();
//
//        // remove from deq indexes of all elements
//        // which are smaller than current element nums[i]
//        while (!deq.isEmpty() && nums[i] > nums[deq.getLast()]) deq.removeLast();
//    }
//
//    public int[] maxSlidingWindow(int[] nums, int k) {
//        int n = nums.length;
//        if (n * k == 0) return new int[0];
//        if (k == 1) return nums;
//
//        // init deque and output
//        this.nums = nums;
//        int max_idx = 0;
//        for (int i = 0; i < k; i++) {
//            clean_deque(i, k);
//            deq.addLast(i);
//            // compute max in nums[:k]
//            if (nums[i] > nums[max_idx]) max_idx = i;
//        }
//        int[] output = new int[n - k + 1];
//        output[0] = nums[max_idx];
//
//        // build output
//        for (int i = k; i < n; i++) {
//            clean_deque(i, k);
//            deq.addLast(i);
//            output[i - k + 1] = nums[deq.getFirst()];
//        }
//        return output;
//    }
//}
