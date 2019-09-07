package Sort.BinarySearch;

public class BinaryRecursionSearch {

    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println(binaryRecursionSearch(a, 0, a.length - 1, 7));
    }

    private static int binaryRecursionSearch(int[] a, int low, int high, int k) {
        if (low >= high) {
            return -1;
        }

        int mid = low + ((high - low) >> 1);
        if (a[mid] == k) {
            return mid;
        } else if (a[mid] > k) {
            return binaryRecursionSearch(a, low, mid - 1, k);
        } else {
            return binaryRecursionSearch(a, mid + 1, high, k);
        }
    }

}
