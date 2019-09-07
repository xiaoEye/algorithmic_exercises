package Sort.N2;

import java.util.Arrays;

public class InsertionSort {

    public static void main(String[] args) {
        int[] a = {1, 3, 5, 7, 6, 4, 2, 8, 9, 2};
        insertionSort(a, a.length);
        System.out.println(Arrays.toString(a));
    }

    private static void insertionSort(int[] a, int n) {
        if (a == null || a.length == 0) {
            return;
        }

        for (int i = 1; i < n; i++) {
            int value = a[i];
            int j = i - 1;
            for (; j >= 0; j--) {
                if (a[j] > value) {
                    a[j + 1] = a[j];
                } else {
                    break;
                }
            }
            a[j + 1] = value;
        }
    }

    private static void swap(int[] a, int p, int j) {
        int temp = a[p];
        a[p] = a[j];
        a[j] = temp;
    }
}
