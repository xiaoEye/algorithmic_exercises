package Sort.NLOGN;

import java.util.Arrays;

public class MergeSort {

    public static void main(String[] args) {
        int[] a = {1, 3, 5, 7, 6, 4, 2, 8, 9, 2};
//        if (a == null || a.length == 0) {
//            return;
//        }
        mergeSort(a, 0, a.length - 1);
        System.out.println(Arrays.toString(a));
    }

    private static void mergeSort(int[] a, int p, int q) {
        if (p >= q) {
            return;
        }

        int mid = p + ((q - p) >> 1);
        mergeSort(a, p, mid);
        mergeSort(a, mid + 1, q);
        merge(a, p, mid, q);
    }

    private static void merge(int[] a, int low, int mid, int high) {
        int i = low;
        int j = mid + 1;

        int[] tmp = new int[high - low + 1];
        int index = 0;

        while (i <= mid && j <= high) {
            if (a[i] <= a[j]) {
                tmp[index++] = a[i++];
            }

            if (a[i] > a[j]) {
                tmp[index++] = a[j++];
            }
        }

        while (i <= mid) {
            tmp[index++] = a[i++];
        }

        while (j <= high) {
            tmp[index++] = a[j++];
        }

        for (int k = 0; k < tmp.length; k++) {
            a[low + k] = tmp[k];
        }
    }

    private static void swap(int[] a, int p, int j) {
        int temp = a[p];
        a[p] = a[j];
        a[j] = temp;
    }
}
