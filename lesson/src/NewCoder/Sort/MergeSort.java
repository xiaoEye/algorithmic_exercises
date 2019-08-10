package NewCoder.Sort;

import java.util.Arrays;

public class MergeSort {

    public static void main(String[] args) {
        int[] A = {54, 35, 48, 36, 27, 12, 44, 44, 8, 14, 26, 17, 28};
        System.out.println(Arrays.toString(A));
        System.out.println(Arrays.toString(mergeSort(A, 0, A.length - 1)));
    }

    public static int[] mergeSort(int[] A, int low, int high) {
        if ((A == null) || A.length < 2) {
            return A;
        }

        int mid = (low + high) / 2;

        if (low < high) {
            mergeSort(A, low, mid);
            mergeSort(A, mid + 1, high);
            merge(A, low, mid, high);
        }

        return A;
    }

    private static void merge(int[] A, int low, int mid, int high) {
        int[] temp = new int[high - low + 1];
        int index = 0;
        int i = low;
        int j = mid + 1;

        while (i <= mid && j <= high) {
            if (A[i] < A[j]) {
                temp[index++] = A[i++];
            } else {
                temp[index++] = A[j++];
            }
        }

        while (i <= mid) {
            temp[index++] = A[i++];
        }

        while (j <= high) {
            temp[index++] = A[j++];
        }

        for (int k = 0; k < temp.length; k++) {
            A[low + k] = temp[k];
        }
    }
}
