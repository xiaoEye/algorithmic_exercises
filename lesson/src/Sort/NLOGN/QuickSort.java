package Sort.NLOGN;

import java.util.Arrays;

public class QuickSort {

    public static void main(String[] args) {
        int[] a = {1, 3, 5, 7, 6, 4, 2, 8, 9, 2};
//        if (a == null || a.length == 0) {
//            return;
//        }
        quickSort(a, 0, a.length - 1);
        System.out.println(Arrays.toString(a));
    }

    private static void quickSort(int[] a, int low, int high) {
        if (low >= high) {
            return;
        }

        int mid = partition(a, low, high);
        quickSort(a, low, mid - 1);
        quickSort(a, mid + 1, high);
    }

    private static int partition(int[] a, int low, int high) {
        int mid = a[high];
        int index = low;

        for (int i = low; i < high; i++) {
            if (a[i] <= mid) {
                swap(a, index, i);
                ++index;
            }
        }
        swap(a, index, high);
        return index;
    }

    private static void swap(int[] a, int p, int j) {
        int temp = a[p];
        a[p] = a[j];
        a[j] = temp;
    }
}
