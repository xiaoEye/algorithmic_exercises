package LeetCode.Middle;

public class LC24 {

    public static void main(String[] args) {
        ListNode head = generateLink(new int[]{1, 2, 3, 4});
//        ListNode head = generateLink(new int[]{1, 1, 2});
        printLink(head);
        head = swapPairs(head);
        printLink(head);
    }

    public static ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null) return head;

        ListNode newHead = head.next;
        ListNode prev = new ListNode(-1);
        prev.next = head;
        while (head != null && head.next != null) {
            prev.next = head.next;
            ListNode tmp = head.next.next;
            head.next.next = head;
            head.next = tmp;

            head = head.next;
            prev = prev.next.next;
        }

        return newHead;
    }

    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    private static ListNode generateLink(int[] a) {
        ListNode pre = new ListNode(-1);
        ListNode cur = pre;
        for (int i = 0; i < a.length; i++) {
            cur.next = new ListNode(a[i]);
            cur = cur.next;
        }
        return pre.next;
    }

    private static void printLink(ListNode head) {
        while (head != null) {
            System.out.print(head.val);
            if (head.next != null) {
                System.out.print("->");
            }
            head = head.next;
        }
        System.out.println();
    }
}
