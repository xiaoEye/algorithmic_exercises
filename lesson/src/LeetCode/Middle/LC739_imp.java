package LeetCode.Middle;

import java.util.Arrays;
import java.util.Stack;

//重点
public class LC739_imp {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(dailyTemperatures(new int[]{73, 74, 75, 71, 69, 72, 76, 73})));
    }

    public static int[] dailyTemperatures(int[] T) {
        int length = T.length;
        int[] result = new int[length];
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < length; i++) {
            while (!stack.isEmpty() && T[i] > T[stack.peek()]) {
                int preIndex = stack.pop();
                result[preIndex] = i - preIndex;
            }
            stack.add(i);
            System.out.println(stack);
        }
        return result;
    }

//    public static int[] dailyTemperatures(int[] T) {
//        int[] result = new int[T.length];
//
//        for (int i = 0; i < T.length; i++) {
//            for (int j = i + 1; j < T.length; j++) {
//                if (T[i] < T[j]) {
//                    result[i] = j - i;
//                    break;
//                }
//            }
//        }
//        return result;
//    }
}
