package LeetCode.Easy;

public class LC14 {

    public static void main(String[] args) {
//        System.out.println(longestCommonPrefix(new String[]{"flower", "flow", "flight"}));
//        System.out.println(longestCommonPrefix(new String[]{"dog", "racecar", "car"}).equals(""));
//        System.out.println(longestCommonPrefix(new String[]{"c", "acc", "ccc"}).equals(""));
        System.out.println(longestCommonPrefix(new String[]{"aca", "cba"}).equals(""));
    }

    public static String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }
        int stringNum = strs.length;
        int minLength = getMinLength(strs);
        StringBuilder sb = new StringBuilder();
        //一个个字母
        for (int i = 0; i < minLength; i++) {
            if (sb.length() != i) {
                break;
            }
            char charOne = strs[0].charAt(i);
            //每两个比较
            for (int j = 0; j < stringNum; j++) {
                if (strs[j].charAt(i) != charOne) {
                    break;
                }
                if (j == stringNum - 1) {
                    sb.append(strs[0].charAt(i));
                }
            }
        }
        return sb.toString();
    }

    private static int getMinLength(String[] strs) {
        int stringNum = strs.length;
        int minLength = strs[0].length();
        for (int i = 0; i < stringNum; i++) {
            if (strs[i].length() < minLength) {
                minLength = strs[i].length();
            }
        }
        return minLength;
    }
}
