package NewCoder.QueenAndStack;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

public class TwoStack {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(twoStack(new int[]{251, 399, 0, 428, 21, 0}, 6)));
    }

    private static Stack<Integer> pushStack = null;
    private static Stack<Integer> popStack = null;

    public static int[] twoStack(int[] ope, int n) {
        pushStack = new Stack<>();
        popStack = new Stack<>();
        int index = 0;
        int[] out = new int[n];
        for (int i = 0; i < n; i++) {
            if (ope[i] > 0) {
                push(ope[i]);
            } else if (ope[i] == 0) {
                out[index++] = pop();
            }
        }
        out = Arrays.copyOf(out, index);
        return out;
    }

    public static void push(int num) {
        pushStack.push(num);
    }

    public static int pop() {
        if (popStack.isEmpty()) {
            while (!pushStack.isEmpty()) {
                popStack.push(pushStack.pop());
            }
        }
        return popStack.pop();
    }
}
