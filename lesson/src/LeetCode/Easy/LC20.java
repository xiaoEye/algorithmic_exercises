package LeetCode.Easy;

import java.util.Stack;

public class LC20 {

    public static void main(String[] args) {
        System.out.println(isValid("()"));
        System.out.println(isValid("()[]{}"));
        System.out.println(isValid("(]"));
        System.out.println(isValid("([)]"));
        System.out.println(isValid("{[]}"));
    }

    public static boolean isValid(String s) {
        if (s.equals("")) return true;
        if (s.length() % 2 != 0) return false;
        Stack<Character> stack = new Stack<>();
        int index = 0;
        for (int i = 0; i < s.length(); i++) {
            if (index < 0) {
                return false;
            }
            char c = s.charAt(i);
            if (c == '(' || c == '[' || c == '{') {
                index++;
                stack.push(c);
            } else if (c == ')' || c == ']' || c == '}') {
                index--;
                if (stack.isEmpty()) return false;
                Character newC = stack.pop();
                if (newC == '(') {
                    if (c == ')') continue;
                    else return false;
                }
                if (newC == '[') {
                    if (c == ']') continue;
                    else return false;
                }
                if (newC == '{') {
                    if (c == '}') continue;
                    else return false;
                }
            }
        }
        return index == 0;
    }
}
