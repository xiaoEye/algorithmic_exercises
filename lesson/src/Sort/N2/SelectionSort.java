package Sort.N2;

import java.util.Arrays;

public class SelectionSort {

    public static void main(String[] args) {
        int[] a = {1, 3, 5, 7, 6, 4, 2, 8, 9, 2};
        selectionSort(a, a.length);
        System.out.println(Arrays.toString(a));
    }

    private static void selectionSort(int[] a, int n) {
        if (a == null || a.length == 0) {
            return;
        }

        for (int i = 0; i < n; i++) {
            int index = i;
            for (int j = i + 1; j < n; j++) {
                if (a[index] > a[j]) {
                    index = j;
                }
            }
            swap(a, i, index);
        }
    }

    private static void swap(int[] a, int p, int j) {
        int temp = a[p];
        a[p] = a[j];
        a[j] = temp;
    }
}
