package NewCoder.Sort;

import java.util.Arrays;

public class BubbleSort {

    public static void main(String[] args) {
        int[] A = {54,35,48,36,27,12,44,44,8,14,26,17,28};
        int n = 13;
        System.out.println(Arrays.toString(A));
        System.out.println(Arrays.toString(bubbleSort(A, n)));
    }

    public static int[] bubbleSort(int[] A, int n) {
        if (A == null || A.length < 2) {
            return A;
        }
        for (int i = n; i >= 2; i--) {
            for (int j = 0; j <= i - 2; j++) {
                if (A[j] > A[j + 1]) {
                    swap(A, j, j + 1);
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
