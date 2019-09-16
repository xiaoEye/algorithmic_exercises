package LeetCode.Easy;

public class LC206_1 {

    public static void main(String[] args) {

    }

    //递归
    //时间复杂度：O(n)，假设 nn 是列表的长度，那么时间复杂度为 O(n)。
    //空间复杂度：O(n)，由于使用递归，将会使用隐式栈空间。递归深度可能会达到 nn 层。
    public ListNode reverseList(ListNode head) {
        if (head == null || head.next == null) return head;
        ListNode p = reverseList(head.next);
        head.next.next = head;
        head.next = null;
        return p;
    }

    // 迭代
    //时间复杂度：O(n)，假设 nn 是列表的长度，时间复杂度是 O(n)
    //空间复杂度：O(1)。
//    public ListNode reverseList(ListNode head) {
//        ListNode pre = null;
//        ListNode cur = head;
//        while (cur != null) {
//            ListNode tmp = cur.next;
//            cur.next = pre;
//            pre = cur;
//            cur = tmp;
//        }
//        return pre;
//    }

    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }
}
