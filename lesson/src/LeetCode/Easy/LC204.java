package LeetCode.Easy;

public class LC204 {

    public static void main(String[] args) {
//        System.out.println((int) Math.sqrt(10));
        System.out.println(countPrimes(1500000));
//        System.out.println(countPrimes(10));
    }

    public static int countPrimes(int n) {
        int count = 0;
        boolean[] signs = new boolean[n];
        for (int i = 0; i < n; i++) {
            signs[i] = false;
        }
        for (int i = 2; i < n; i++) {
            if (!signs[i]) {
                count++;
                for (int j = i + i; j < n; j += i) {
                    signs[j] = true;
                }
            }
        }
        return count;
    }
}
