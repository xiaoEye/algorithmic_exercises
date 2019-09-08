package Sort.Tree;

public class PrintTree {

    public static void main(String[] args) {
        printTree(new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9});
    }

    private static void printTree(int[] a) {
        for (int i = 1; i < a.length; i++) {
            if ((i & (i - 1)) == 0 && i != 1) {
                System.out.println();
            }
            System.out.print(a[i] + " ");
        }
    }
}
