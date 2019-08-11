package NewCoder.LinkList;

public class InsertValueIntoCircle {

    public static void main(String[] args) {

        System.out.println(insert(new int[]{1, 3, 4, 5, 7}, new int[]{1, 2, 3, 4, 0}, 2).val);
        System.out.println(insert(new int[]{1, 3, 4, 5, 7}, new int[]{1, 2, 3, 4, 0}, 2).next.val);
    }

    public static ListNode insert(int[] a, int[] nxt, int val) {
        ListNode insertNode = new ListNode(val);
        if (a == null || a.length == 0) {
            return insertNode;
        }

        ListNode head = new ListNode(a[0]);
        ListNode cur = head;
        for (int i = 0; i < a.length - 1; i++) {
            ListNode nextNode = new ListNode(a[nxt[i]]);
            cur.next = nextNode;
            cur = nextNode;
        }

        ListNode pre = head;
        ListNode next = head.next;
        if (val < pre.val) {
            cur.next = insertNode;
            insertNode.next = head;
            return insertNode;
        }
        while (next != null && val > next.val) {
            pre = next;
            next = next.next;
        }
        pre.next = insertNode;
        insertNode.next = next;
        return head;
    }

    public static class ListNode {
        int val;
        ListNode next = null;

        public ListNode(int val) {
            this.val = val;
        }
    }
}

