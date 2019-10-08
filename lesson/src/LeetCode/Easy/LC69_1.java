package LeetCode.Easy;

public class LC69_1 {

    public static void main(String[] args) {
        System.out.println(mySqrt(2147395599));
    }

    public static int mySqrt(int x) {
        return (int) sqrt(x);
    }


    public static long sqrt(int x) {
        long low = 0;
        long high = x;

        while (low <= high) {
            long mid = low + (high - low) / 2;
            if (mid * mid > x) {
                high = mid - 1;
            } else if (mid * mid <= x && (mid + 1) * (mid + 1) > x) {
                return mid;
            } else {
                low = mid + 1;
            }
        }

        return -1;
    }
}
