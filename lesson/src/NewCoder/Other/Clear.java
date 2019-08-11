package NewCoder.Other;

import java.util.HashMap;
import java.util.Map;

public class Clear {

    public static void main(String[] args) {
        System.out.println(getWinner(new int[]{1, 2, 2, 1}, 4));
        System.out.println(getWinner(new int[]{1, 1, 1}, 3));
        System.out.println(getWinner(new int[]{15, 41, 21, 21, 21, 6, 29, 42, 19, 60, 22, 63, 42, 49, 32, 22, 24, 57, 35, 54, 22, 31, 12, 15, 31, 15, 2, 12, 24, 40, 58, 16, 49, 60, 59, 58, 6, 63, 20, 42, 14, 31, 1, 21, 20, 38, 47, 1, 25, 50, 52, 20, 14, 40, 5, 12, 24, 36, 28, 35, 4, 49, 20},
                63));
    }

    public static int getWinner(int[] A, int n) {
        int[] count = new int[n+1];
        for(int i=0;i<n;i++){
            count[A[i]]++;
        }
        int res = 0;
        for(int i=1;i<=n;i++){
            res^=count[i];
        }
        return res!=0 ?1:0;
    }
}
