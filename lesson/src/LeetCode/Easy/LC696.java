package LeetCode.Easy;

public class LC696 {

    public static void main(String[] args) {
        System.out.println(countBinarySubstrings("00110011"));
    }

    public static int countBinarySubstrings(String s) {
        int result = 0;
        int prev = 0;
        int cur = 1;
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) != s.charAt(i - 1)) {
                result += Math.min(prev, cur);
                prev = cur;
                cur = 1;
            } else {
                cur++;
            }
        }
        return result + Math.min(prev, cur);
    }

}
