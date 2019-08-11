package NewCoder.Other;

public class Jump {

    public static void main(String[] args) {
        System.out.println(checkWin(122));
        System.out.println(checkWin(4));
        System.out.println(checkWin(108));
        System.out.println(checkWin(3));
        System.out.println(checkWin(127));
    }

    public static int checkWin(int n) {
        if (n <= 3) {
            return 1;
        }
        // 1:win; 0:lose
        if ((n - 1) % 4 == 0) {
            return 0;
        }
        return 1;
    }
}
