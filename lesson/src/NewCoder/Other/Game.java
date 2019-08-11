package NewCoder.Other;

public class Game {

    public static void main(String[] args) {
        System.out.println(getWinner(5, 3));
    }

    public static char getWinner(int n, int m) {
        if ((n - 1) % 2 == 0 && (m - 1) % 2 == 0) {
            return 'B';
        }
        return 'A';
    }
}
