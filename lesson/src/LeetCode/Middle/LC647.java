package LeetCode.Middle;

public class LC647 {

    public static void main(String[] args) {

    }

    int num = 0;

    public int countSubstrings(String s) {
        for (int i = 0; i < s.length(); i++) {
            count(s, i, i);
            count(s, i, i + 1);
        }

        return num;
    }

    private void count(String s, int start, int end) {
        while (start >= 0 && end <= s.length() - 1 && s.charAt(start) == s.charAt(end)) {
            num++;
            start--;
            end++;
        }
    }
}
