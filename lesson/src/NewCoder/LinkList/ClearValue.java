package NewCoder.LinkList;

public class ClearValue {

    public static void main(String[] args) {
        // {1,2,3,4,3,2,1},2
        // {1,3,4,3,1}
    }

    public ListNode clear(ListNode head, int val) {
        if (head == null) {
            return null;
        }
        ListNode newHead = head;
        ListNode cur = head;
        ListNode pre = head;
        if (head.val == val) {
            newHead = head.next;
        }

        while (cur.next != null) {
            if (cur.val == val) {
                pre.next = cur.next;
                cur = cur.next;
            } else {
                pre = cur;
                cur = cur.next;
            }
        }
        if (cur.val == val) {
            pre.next = null;
        }

        return newHead;
    }

    public class ListNode {
        int val;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }
}
