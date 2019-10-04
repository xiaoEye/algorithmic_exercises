package LeetCode.Easy;

public class LC136 {

    public static void main(String[] args) {

    }

    public int singleNumber(int[] nums) {
        int result = 0;
        for (int n : nums) {
            result ^= n;
        }
        return result;
    }
}
