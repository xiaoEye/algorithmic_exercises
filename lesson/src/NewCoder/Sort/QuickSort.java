package NewCoder.Sort;

import java.util.Arrays;

public class QuickSort {

    public static void main(String[] args) {
        int[] A = {54, 35, 48, 36, 27, 12, 44, 44, 8, 14, 26, 17, 28};
        System.out.println(Arrays.toString(A));
        quickSort(A, 0, A.length - 1);
        System.out.println(Arrays.toString(A));
    }

    public static void quickSort(int[] a, int left, int right) {
        if (left >= right) {
            return;
        }

        int base = a[left];
        int i = left;
        int j = right;

        while (i < j) {
            while (a[j] >= base && i < j) {
                j--;
            }

            while (a[i] <= base && i < j) {
                i++;
            }

            if (i < j) {
                int temp = a[i];
                a[i] = a[j];
                a[j] = temp;
            }
        }

        // 此时 i=j
        a[left] = a[i];
        a[i] = base;

        quickSort(a, left, i - 1);
        quickSort(a, i + 1, right);
    }
}
