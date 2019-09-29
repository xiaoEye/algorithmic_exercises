package LeetCode.Easy;

public class LC9_1 {

    public static void main(String[] args) {

    }

    public boolean isPalindrome(int x) {
        if (x == 0) return true;
        if (x < 0 || x % 10 == 0) return false;

        int right = 0;
        while (x > right) {
            right = right * 10 + x % 10;
            x = x / 10;
        }

        return x == right || x == right / 10;
    }

//    public boolean isPalindrome(int x) {
//        String xString = String.valueOf(x);
//        int start = 0;
//        int end = xString.length() - 1;
//        while (start < end) {
//            if (xString.charAt(start++) != xString.charAt(end--)) {
//                return false;
//            }
//        }
//        return true;
//    }
}
