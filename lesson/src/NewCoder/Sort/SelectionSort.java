package NewCoder.Sort;

import java.util.Arrays;

public class SelectionSort {

    public static void main(String[] args) {
        int[] A = {3, 2, 1, 33, 2};
        System.out.println(Arrays.toString(A));
        System.out.println(Arrays.toString(selectionSort(A, A.length)));
    }

    public static int[] selectionSort(int[] A, int n) {
        if ((A == null) || A.length < 2) {
            return A;
        }
        for (int i = n; i >= 2; i--) {
            for (int j = n - 1; j >= 1; j--) {
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
