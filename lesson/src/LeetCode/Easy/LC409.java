package LeetCode.Easy;

import java.util.HashMap;
import java.util.Map;

public class LC409 {

    public static void main(String[] args) {

    }

    public int longestPalindrome(String s) {
        int[] result = new int[128];
        for (Character c : s.toCharArray()) {
            result[c]++;
        }
        int length = 0;
        boolean ownSingle = false;
        for (int i = 0; i < result.length; i++) {
            length += (result[i] / 2) * 2;
            if (!ownSingle && result[i] % 2 == 1) {
                ownSingle = true;
            }
        }
        return ownSingle ? length + 1 : length;
    }
}
