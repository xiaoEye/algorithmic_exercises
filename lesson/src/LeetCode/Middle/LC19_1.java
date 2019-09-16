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
        ListNode slow = prev;
        ListNode fast = prev;
        while (fast != null) {
            fast = fast.next;
            if (n == -1) {
                slow = slow.next;
            } else {
                n--;
            }
        }
        slow.next = slow.next.next;

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
