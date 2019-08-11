package NewCoder.Other;

public class Paint {

    public static void main(String[] args) {
        System.out.println(getMost(1, 2));
    }

    public static int getMost(int n, int m) {
        if (n * m % 2 == 0) {
            return n * m / 2;
        } else {
            return n * m / 2 + 1;
        }
    }
}
