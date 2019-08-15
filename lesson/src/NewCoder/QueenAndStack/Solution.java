package NewCoder.QueenAndStack;

import java.util.Stack;

public class Solution {

    private Stack<Integer> allNumStack = new Stack<>();
    private Stack<Integer> minStack = new Stack<>();

    public void push(int node) {
        allNumStack.push(node);
        if (minStack.isEmpty()) {
            minStack.push(node);
        } else {
            if (minStack.peek() > node) {
                minStack.push(node);
            } else {
                minStack.push(minStack.peek());
            }
        }
    }

    public void pop() {
        if (minStack.isEmpty()) {
            return;
        }
        allNumStack.pop();
        minStack.pop();
    }

    public int top() {
        if (minStack.isEmpty()) {
            return 0;
        }
        return allNumStack.peek();
    }

    public int min() {
        if (minStack.isEmpty()) {
            return 0;
        }
        return minStack.peek();
    }
}
