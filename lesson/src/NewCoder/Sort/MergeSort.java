package NewCoder.Sort;

import java.util.Arrays;

public class MergeSort {

    public static void main(String[] args) {
        int[] A = {54,35,48,36,27,12,44,44,8,14,26,17,28};
        System.out.println(Arrays.toString(A));
        System.out.println(Arrays.toString(mergeSort(A, A.length)));
    }

    public static int[] mergeSort(int[] A, int n) {
        if ((A == null) || A.length < 2) {
            return A;
        }
        for (int i = 1; i <= n; i++) {
            for (int j = i - 1; j >= 1; j--) {
                if (A[j] < A[j - 1]) {
                    swap(A, j, j - 1);
                }
            }
        }
        return A;
    }

    private static void swap(int[] A, int i, int j) {
        int mid = A[i];
        A[i] = A[j];
        A[j] = mid;
    }
}
