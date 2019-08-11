package NewCoder.LinkList;

public class Divide {

    public static void main(String[] args) {

    }

    public static ListNode listDivide(ListNode head, int val) {
        if (head == null) {
            return null;
        }
        if (head.next == null) {
            return head;
        }

        ListNode smallHead = null;
        ListNode smallCur = null;
        ListNode largeHead = null;
        ListNode largeCur = null;

        ListNode cur = head;
        ListNode pre = head;
        while (cur != null) {
            if (cur.val <= val) {
                if (smallHead == null) {
                    smallHead = cur;
                    smallCur = smallHead;
                } else {
                    smallCur.next = cur;
                    smallCur = cur;
                }
            } else {
                if (largeHead == null) {
                    largeHead = cur;
                    largeCur = largeHead;
                } else {
                    largeCur.next = cur;
                    largeCur = cur;
                }
            }
            pre = cur;
            cur = cur.next;
            pre.next = null;
        }
        if (smallCur != null) {
            smallCur.next = largeHead;
        }
        return smallHead != null ? smallHead : largeHead;
    }

    public class ListNode {
        int val;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }
}
