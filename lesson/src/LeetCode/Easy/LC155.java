package LeetCode.Easy;

import java.util.Stack;

public class LC155 {

    private Stack<Integer> stack;
    private Stack<Integer> min;

    //两中方法
    //一是只有小的才放
    //二是比min里大就重复发给你min的peek值
    public LC155() {
        stack = new Stack<>();
        min = new Stack<>();
    }

    public void push(int x) {
        stack.push(x);
        if (min.isEmpty() || min.peek() >= x) {
            min.push(x);
        }
    }

    public void pop() {
        int num = stack.pop();
        if (min.peek() == num) {
            min.pop();
        }
    }

    public int top() {
        return stack.peek();
    }

    public int getMin() {
        return min.peek();
    }
}
