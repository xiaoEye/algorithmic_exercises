package LeetCode.Easy;

import java.util.Arrays;

public class LC922 {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(sortArrayByParityII(new int[]{4, 2, 5, 7})));
        System.out.println(Arrays.toString(sortArrayByParityII(new int[]{2, 3})));
    }

    public static int[] sortArrayByParityII(int[] A) {
        if (A == null || A.length == 0) return A;
        int even = 0; //偶数
        int odd = 1; //奇数

        while (even < A.length && odd < A.length) {
            while (A[even] % 2 == 0) {
                even += 2;
                if (even >= A.length) break;
            }
            while (A[odd] % 2 == 1) {
                odd += 2;
                if (odd >= A.length) break;
            }
            if (even < A.length && odd < A.length) {
                int tmp = A[even];
                A[even] = A[odd];
                A[odd] = tmp;
                even += 2;
                odd += 2;
            } else {
                break;
            }
        }
        return A;
    }
}
