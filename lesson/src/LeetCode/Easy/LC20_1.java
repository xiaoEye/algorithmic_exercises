package LeetCode.Easy;

import java.util.Stack;

public class LC20_1 {

    public static void main(String[] args) {
        System.out.println(isValid("()"));
    }

    public static boolean isValid(String s) {
        if (s.equals("")) return true;
        int length = s.length();
        if (length % 2 != 0) return false;

        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '[') {
                stack.push(s.charAt(i));
                continue;
            }
            if (stack.isEmpty()) {
                return false;
            }

            if (s.charAt(i) == ')' && stack.pop() != '(') return false;
            if (s.charAt(i) == '}' && stack.pop() != '{') return false;
            if (s.charAt(i) == ']' && stack.pop() != '[') return false;
        }

        return stack.isEmpty();
    }
}
