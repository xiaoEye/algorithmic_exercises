package LeetCode.Middle;

public class LC8 {

    public static void main(String[] args) {
        System.out.println(myAtoi(" -4193 with words"));
        System.out.println(myAtoi("-91283472332"));
        System.out.println(myAtoi("42"));
        System.out.println(myAtoi("-42"));
        System.out.println(myAtoi("  0000000000012345678"));
        System.out.println(myAtoi("    0000000000000   "));
        System.out.println(myAtoi("    +0a32"));

    }

    public static int myAtoi(String str) {
        char[] seq = str.trim().toCharArray();
        if (seq.length == 0 || (seq[0] < '0' || seq[0] > '9') && seq[0] != '-' && seq[0] != '+') return 0;
        int flag = 1;
        int result = 0;
        for (int i = 0; i < seq.length; i++) {
            if (seq[i] == '-' && i == 0) {
                flag = -1;
                continue;
            }
            if (seq[i] == '+' && i == 0) continue;
            if (seq[i] < '0' || seq[i] > '9') break;
            if (result * flag > Integer.MAX_VALUE / 10 || (result * flag == Integer.MAX_VALUE / 10 && (seq[i] - '0') > Integer.MAX_VALUE % 10))
                return Integer.MAX_VALUE;
            if (result * flag < Integer.MIN_VALUE / 10 || (result * flag == Integer.MIN_VALUE / 10 && (seq[i] - '0') * flag < Integer.MIN_VALUE % 10))
                return Integer.MIN_VALUE;
            result = result * 10 + seq[i] - '0';
        }
        return result * flag;
    }
}
