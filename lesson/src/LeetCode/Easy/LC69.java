package LeetCode.Easy;

public class LC69 {

    public static void main(String[] args) {
        System.out.println(mySqrt(9));
    }

    public static int mySqrt(int x) {
        return (int) sqrt(x);
    }

    private static long sqrt(long x) {
        long low = 0;
        long high = x;

        while (low <= high) {
            long mid = low + ((high - low) >> 1);
            if (mid * mid <= x && (mid + 1) * (mid + 1) > x) {
                return mid;
            } else if (mid * mid > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return -1;
    }
}
