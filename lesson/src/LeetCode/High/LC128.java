package LeetCode.High;

import java.util.HashSet;
import java.util.Set;

public class LC128 {

    public static void main(String[] args) {

    }

    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }
        int maxLength = 0;
        for (int num : set) {
            if (!set.contains(num - 1)) {
                int curLength = 1;
                while (set.contains(num + 1)) {
                    curLength++;
                    num++;
                }

                maxLength = Math.max(maxLength, curLength);
            }
        }
        return maxLength;
    }
}
