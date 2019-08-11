package NewCoder.Other;

import java.util.Arrays;

public class HorseRace {

    public static void main(String[] args) {
        System.out.println(winMost(new int[]{1, 2, 3}, new int[]{1, 2, 3}, 3));
    }

    public static int winMost(int[] oppo, int[] horses, int n) {
        int num = 0;
        Arrays.sort(oppo);
        Arrays.sort(horses);
        int oppoIndex = n - 1;
        int horsesIndex = n - 1;
        while (horsesIndex >= 0 && oppoIndex >= 0) {
            if (horses[horsesIndex] > oppo[oppoIndex]) {
                num++;
                horsesIndex--;
                oppoIndex--;
            } else {
                oppoIndex--;
            }
        }
        return num;
    }
}
