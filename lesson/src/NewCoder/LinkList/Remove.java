package NewCoder.LinkList;

public class Remove {

    public static void main(String[] args) {

    }

    public static ListNode removeNode(ListNode pNode, int delVal) {
        if (pNode == null) {
            return null;
        }
        if (pNode.next == null && pNode.val == delVal) {
            return null;
        }

        if (pNode.val == delVal) {
            ListNode newHead = pNode.next;
            pNode.next = null;
            return newHead;
        }

        ListNode cur = pNode;
        ListNode pre = null;
        while (cur.next.next != null) {
            pre = cur;
            cur = cur.next;
            if (cur.val == delVal) {
                pre.next = cur.next;
                return pNode;
            }
        }
        if (cur.next.val == delVal) {
            cur.next = null;
        }
        return pNode;
    }

    public static class ListNode {
        int val;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }
}
