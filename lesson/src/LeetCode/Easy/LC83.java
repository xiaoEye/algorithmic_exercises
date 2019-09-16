package LeetCode.Easy;

public class LC83 {

    public static void main(String[] args) {
        ListNode head = generateLink(new int[]{1, 1, 1});
//        ListNode head = generateLink(new int[]{1, 1, 2});
        printLink(head);
        deleteDuplicates(head);
        printLink(head);
    }

    // 时间复杂度：O(n)
    // 空间复杂度：O(1)
    public static ListNode deleteDuplicates(ListNode head) {
        if (head == null || head.next == null) return head;

        ListNode cur = head;
        while (cur != null && cur.next != null) {
            if (cur.val == cur.next.val) {
                cur.next = cur.next.next;
            } else {
                cur = cur.next;
            }
        }
        return head;
    }

    // 时间复杂度：O(n)
    // 空间复杂度：O(1)
//    public static ListNode deleteDuplicates(ListNode head) {
//        if (head == null || head.next == null) return head;
//
//        ListNode cur = head;
//        while (cur != null) {
//            ListNode tmp = cur.next;
//            while (tmp != null && cur.val == tmp.val) {
//                tmp = tmp.next;
//            }
//            cur.next = tmp;
//            cur = cur.next;
//        }
//        return head;
//    }

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


    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }
}
