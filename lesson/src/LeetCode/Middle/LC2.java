package LeetCode.Middle;

public class LC2 {

    public static void main(String[] args) {
        LC2 lc2 = new LC2();
        ListNode head1 = lc2.generateList(new int[]{9, 2});
        ListNode head2 = lc2.generateList(new int[]{1});

        ListNode head = lc2.addTwoNumbers(head1, head2);
        lc2.printLink(head);
    }

    private ListNode generateList(int[] array) {
        ListNode head = new ListNode(array[0]);
        ListNode cur = head;
        for (int i = 1; i < array.length; i++) {
            ListNode temp = new ListNode(array[i]);
            cur.next = temp;
            cur = cur.next;
        }
        return head;
    }

    private void printLink(ListNode node) {
        while (node != null) {
            System.out.println(node.val);
            node = node.next;
        }
    }

    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if (l1.val == 0 && l1.next == null) {
            return l2;
        }
        if (l2.val == 0 && l2.next == null) {
            return l1;
        }

        ListNode newHead = null;
        ListNode cur = null;
        int carry = 0;
        ListNode l1Cur = l1;
        ListNode l2Cur = l2;
        while (l1Cur != null || l2Cur != null) {
            int l1val = (l1Cur != null) ? l1Cur.val : 0;
            int l2val = (l2Cur != null) ? l2Cur.val : 0;

            if (newHead == null) {
                newHead = new ListNode((l1val + l2val) % 10);
                cur = newHead;
            } else {
                ListNode temp = new ListNode((l1val + l2val + carry) % 10);
                cur.next = temp;
                cur = cur.next;
            }
            if (l1val + l2val + carry > 9) {
                carry = 1;
            } else {
                carry = 0;
            }

            l1Cur = (l1Cur != null) ? l1Cur.next : l1Cur;
            l2Cur = (l2Cur != null) ? l2Cur.next : l2Cur;
        }

        if (carry == 1) {
            ListNode temp = new ListNode(1);
            cur.next = temp;
            cur = cur.next;
        }

        return newHead;
    }
}
