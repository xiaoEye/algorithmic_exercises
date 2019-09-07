package LeetCode.Easy;

public class LC344 {

    public static void main(String[] args) {
        char[] news = {'h', 'e', 'l', 'l', 'o'};
        reverseString(news);
        System.out.println(news);
    }

    public static void reverseString(char[] s) {
        int low = 0;
        int high = s.length - 1;

        while (low < high) {
            swap(s, low++, high--);
        }
    }

    private static void swap(char[] s, int p, int q) {
        char temp = s[p];
        s[p] = s[q];
        s[q] = temp;
    }
}
