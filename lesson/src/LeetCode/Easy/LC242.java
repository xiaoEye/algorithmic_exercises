package LeetCode.Easy;

import java.util.HashMap;
import java.util.Map;

public class LC242 {

    public static void main(String[] args) {
        System.out.println(isAnagram("aacc", "ccac"));
    }

    public static boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;
        int[] counts = new int[26];
        for (char c : s.toCharArray()) {
            counts[c - 'a']++;
        }
        for (char c : t.toCharArray()) {
            counts[c - 'a']--;
            if (counts[c - 'a'] < 0) return false;
        }
        return true;
    }

//    public static boolean isAnagram(String s, String t) {
//        if (s.length() != t.length()) return false;
//        Map<Character, Integer> map = new HashMap<>();
//
//        char[] chars = s.toCharArray();
//        for (int i = 0; i < chars.length; i++) {
//            map.put(chars[i], map.getOrDefault(chars[i], 0) + 1);
//        }
//
//        char[] targetChars = t.toCharArray();
//        for (int i = 0; i < targetChars.length; i++) {
//            if (!map.containsKey(targetChars[i])) {
//                return false;
//            } else {
//                map.put(targetChars[i], map.get(targetChars[i]) - 1);
//                if (map.get(targetChars[i]) < 0) return false;
//            }
//        }
//        return true;
//    }
}
