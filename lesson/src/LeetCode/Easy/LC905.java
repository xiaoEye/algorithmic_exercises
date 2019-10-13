package LeetCode.Easy;

import java.util.Arrays;

public class LC905 {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(sortArrayByParity(new int[]{0, 2, 1, 4})));
        System.out.println(Arrays.toString(sortArrayByParity(new int[]{0, 2})));
    }

    public static int[] sortArrayByParity(int[] A) {
        if (A == null || A.length == 0) return A;
        int left = 0;
        int right = A.length - 1;
        while (left < right) {
            while (A[left] % 2 == 0) {
                left++;
                if (left > A.length - 1) break;
            }
            while (A[right] % 2 == 1) {
                right--;
                if (right < 0) break;
            }
            if (left < right) {
                int tmp = A[left];
                A[left] = A[right];
                A[right] = tmp;
                left++;
                right--;
            } else {
                break;
            }
        }
        return A;
    }
}
