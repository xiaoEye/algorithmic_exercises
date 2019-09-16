package LeetCode.Middle;

public class LC19_1 {

    public static void main(String[] args) {

    }

    //双指针
    //时间复杂度：O(L)
    //空间复杂度：O(1)
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if (head.next == null) return null;

        ListNode prev = new ListNode(-1);
        prev.next = head;
        ListNode i = prev;
        ListNode j = prev;
        while (i != null && j != null) {
            j = j.next;
            if (n == -1) {
                i = i.next;
            } else {
                n--;
            }
        }
        i.next = i.next.next;

        return prev.next;
    }

    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }
}
