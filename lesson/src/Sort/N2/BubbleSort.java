package Sort.N2;

import java.util.Arrays;

public class BubbleSort {

    public static void main(String[] args) {
        int[] a = {1, 3, 5, 7, 6, 4, 2, 8, 9, 2};
        bubbleSort(a, a.length);
        System.out.println(Arrays.toString(a));
    }

    private static void bubbleSort(int[] a, int n) {
        if (a == null || a.length == 0) {
            return;
        }

        for (int i = 0; i < n; i++) {
            boolean flag = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (a[j] > a[j + 1]) {
                    swap(a, j, j + 1);
                    flag = true;
                }
            }

            if (!flag) {
                break;
            }
        }
    }

    private static void swap(int[] a, int p, int j) {
        int temp = a[p];
        a[p] = a[j];
        a[j] = temp;
    }
}
