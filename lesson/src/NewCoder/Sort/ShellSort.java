package NewCoder.Sort;

import java.util.Arrays;

public class ShellSort {

    public static void main(String[] args) {
        int[] A = {54, 35, 48, 36, 27, 12, 44, 44, 8, 14, 26, 17, 28};
        System.out.println(Arrays.toString(A));
        shellSort(A, A.length);
        System.out.println(Arrays.toString(A));
    }

    public static void shellSort(int[] a, int n) {
        if (a == null || a.length == 0) return;

        int feet = n / 2;
        int index = 0;
        while (feet > 0) {
            for (int i = feet; i < n; i++) {
                index = i;
                while (index >= feet) {
                    if (a[index] < a[index - feet]) {
                        swap(a, index, index - feet);
                        index -= feet;
                    } else {
                        break;
                    }
                }
            }
            feet /= 2;
        }
    }

    private static void swap(int[] a, int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
}
