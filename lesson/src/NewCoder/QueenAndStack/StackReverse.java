package NewCoder.QueenAndStack;

import java.util.Arrays;
import java.util.Stack;

public class StackReverse {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(reverseStack(new int[]{4, 3, 2, 1}, 4)));
    }

    public static int[] reverseStack(int[] A, int n) {
        if (n == 0) {
            return null;
        }
        int temp = A[n - 1];
        reverseStack(A, n - 1);
        A[A.length - n] = temp;
        return A;
    }

    private static void reverse(Stack<Integer> stack) {
        if (stack.isEmpty()) {
            return;
        }
        int num = get(stack);
        reverse(stack);
        stack.push(num);
    }

    private static int get(Stack<Integer> stack) {
        int num = stack.pop();
        if (stack.isEmpty()) {
            return num;
        } else {
            int i = get(stack);
            stack.push(num);
            return i;
        }
    }
}
