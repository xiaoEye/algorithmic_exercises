package Sort.BinarySearch;

public class BinarySearch {

    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println(binarySearch(a, 8));
    }

    private static int binarySearch(int[] a, int k) {
        if (a == null || a.length == 0) {
            return -1;
        }

        int low = 0;
        int high = a.length - 1;

        while (low <= high) {
            int mid = low + ((high - low) >> 1);
            if (a[mid] > k) {
                high = mid - 1;
            } else if (a[mid] < k) {
                low = mid + 1;
            } else {
                return mid;
            }
        }

        return -1;
    }
}

