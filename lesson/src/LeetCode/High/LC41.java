package LeetCode.High;

public class LC41 {

    public static void main(String[] args) {
        System.out.println(firstMissingPositive(new int[]{1, 2, 0}));
        System.out.println(firstMissingPositive(new int[]{3, 4, -1, 1}));
        System.out.println(firstMissingPositive(new int[]{7, 8, 9, 11, 12}));
    }

    public static int firstMissingPositive(int[] nums) {
        int length = nums.length;
        int small = 1;
        boolean isExist = false;

        while (true) {
            for (int i = 0; i < length; i++) {
                if (nums[i] == small) {
                    isExist = true;
                    break;
                }
            }
            if (isExist) {
                isExist = false;
                ++small;
            } else {
                return small;
            }
        }
    }
}
