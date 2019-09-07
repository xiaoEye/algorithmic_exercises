package Sort.BinarySearch;

public class FindLast {

    public static void main(String[] args) {
        int[] a = {1, 1, 3, 3, 5, 6, 6, 8, 9};
        System.out.println(binarySearch(a, 3));
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
                if (mid == high || a[mid + 1] != k) {
                    return mid;
                } else {
                    low = mid + 1;
                }
            }
        }

        return -1;
    }
}
