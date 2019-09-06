package LeetCode.Middle;

import java.util.Stack;

public class LC150 {

    public static void main(String[] args) {
        System.out.println(evalRPN(new String[]{"2", "1", "+", "3", "*"}));
        System.out.println(evalRPN(new String[]{"4", "13", "5", "/", "+"}));
    }

    public static int evalRPN(String[] tokens) {
        Stack<String> stack = new Stack<>();
        int length = tokens.length;
        for (int i = 0; i < length; i++) {
            if (tokens[i].equals("+")) {
                stack.push(String.valueOf(Integer.parseInt(stack.pop()) + Integer.parseInt(stack.pop())));
            } else if (tokens[i].equals("-")) {
                int num2 = Integer.parseInt(stack.pop());
                stack.push(String.valueOf(Integer.parseInt(stack.pop()) - num2));
            } else if (tokens[i].equals("*")) {
                stack.push(String.valueOf(Integer.parseInt(stack.pop()) * Integer.parseInt(stack.pop())));
            } else if (tokens[i].equals("/")) {
                int num2 = Integer.parseInt(stack.pop());
                stack.push(String.valueOf(Integer.parseInt(stack.pop()) / num2));
            } else {
                stack.push(tokens[i]);
            }
        }
        return Integer.parseInt(stack.pop());
    }
}
