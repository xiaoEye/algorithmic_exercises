package LeetCode.Easy;

import java.util.Arrays;

public class LC455 {

    public static void main(String[] args) {

    }

    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int gIndex = 0;
        int sIndex = 0;
        int nums = 0;
        while (gIndex < g.length && sIndex < s.length) {
            if (s[sIndex] >= g[gIndex]) {
                nums++;
                gIndex++;
                sIndex++;
            } else {
                sIndex++;
            }
        }
        return nums;
    }
}
