package NewCoder.Sort;

import java.util.Arrays;

public class HeapSort {

    public static void main(String[] args) {
        int[] A = {54, 35, 48, 36, 27, 12, 44, 44, 8, 14, 26, 17, 28};
        System.out.println(Arrays.toString(A));
        heapSort(A, A.length);
        System.out.println(Arrays.toString(A));
    }

    public static void heapSort(int[] a, int len) {
        if (a.length < 2 || a == null) {
            return;
        }

        for (int i = len / 2 - 1; i >= 0; i--) {
            heapAdjust(a, i, len);
        }

        for (int i = len - 1; i > 0; i--) {
            swap(a, 0, i);
            heapAdjust(a, 0, i);
        }
    }

    private static void heapAdjust(int[] a, int i, int len) {
        int temp = a[i];
        for (int j = 2 * i + 1; j < len; j = 2 * j + 1) {
            if (j + 1 < len && a[j] < a[j + 1]) {
                j++;
            }

            if (temp < a[j]) {
                swap(a, i, j);
                i = j;
            } else {
                break;
            }
        }
    }

    private static void swap(int[] a, int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
}
