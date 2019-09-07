package LeetCode.Middle;


import java.util.Arrays;

public class LC151 {

    public static void main(String[] args) {
        System.out.println(reverseWords("  a good   example!  "));
    }

    public static String reverseWords(String s) {
        if (s == null || s.length() == 0) {
            return s;
        }
        s = reverseWord(s);

        String[] strings = s.split(" ");
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < strings.length; i++) {
            strings[i] = reverseWord(strings[i]);
            if (!strings[i].equals("")) {
                sb.append(strings[i] + " ");
            }
        }

        return sb.toString().trim();
    }

    private static String reverseWord(String s) {
        if (s.equals("")) {
            return s;
        }

        char[] chars = s.toCharArray();
        int low = 0;
        int high = chars.length - 1;

        while (low < high) {
            char temp = chars[low];
            chars[low++] = chars[high];
            chars[high--] = temp;
        }
        return String.valueOf(chars);
    }
}
