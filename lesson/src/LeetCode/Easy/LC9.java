package LeetCode.Easy;

public class LC9 {

    public static void main(String[] args) {
        System.out.println(isPalindrome(-123));
        System.out.println(isPalindrome(123));
        System.out.println(isPalindrome(121));
        System.out.println(isPalindrome(1221));
        System.out.println(isPalindrome(12));
    }

    public static boolean isPalindrome(int x) {
        char[] chars = String.valueOf(x).toCharArray();
        int i = 0;
        int j = chars.length - 1;
        while (i < j) {
            if (chars[i++] != chars[j--]) {
                return false;
            }
        }
        return true;
    }
}
