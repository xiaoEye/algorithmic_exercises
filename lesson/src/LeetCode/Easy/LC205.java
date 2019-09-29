package LeetCode.Easy;

public class LC205 {

    public static void main(String[] args) {
    }

    public static boolean isIsomorphic(String s, String t) {
        int[] sPosition = new int[256];
        int[] tPosition = new int[256];
        for (int i = 0; i < s.length(); i++) {
            char sc = s.charAt(i);
            char tc = t.charAt(i);
            if (sPosition[sc] != tPosition[tc]) {
                return false;
            }
            sPosition[sc] = i + 1;
            tPosition[tc] = i + 1;
        }
        return true;
    }
}
