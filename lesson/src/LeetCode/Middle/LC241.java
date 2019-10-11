package LeetCode.Middle;

import java.util.ArrayList;
import java.util.List;

public class LC241 {

    public static void main(String[] args) {

    }

    public List<Integer> diffWaysToCompute(String input) {
        List<Integer> results = new ArrayList<>();

        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (c == '+' || c == '-' || c == '*') {
                List<Integer> left = diffWaysToCompute(input.substring(0, i));
                List<Integer> right = diffWaysToCompute(input.substring(i + 1));
                for (int l : left) {
                    for (int r : right) {
                        switch (c) {
                            case '+':
                                results.add(l + r);
                                break;
                            case '-':
                                results.add(l - r);
                                break;
                            case '*':
                                results.add(l * r);
                                break;
                        }
                    }
                }
            }
        }
        if (results.size() == 0) {
            results.add(Integer.valueOf(input));
        }
        return results;
    }
}
