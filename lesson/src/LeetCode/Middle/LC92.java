package LeetCode.Middle;

public class LC92 {

    public static void main(String[] args) {
        ListNode head = generateLink(new int[]{1, 2, 3, 4, 5});
        printLink(head);
        ListNode newHead = reverseBetween(head, 1, 4);
        printLink(newHead);
    }

    // 1 ≤ m ≤ n ≤ 链表长度
    public static ListNode reverseBetween(ListNode head, int m, int n) {
        if (head == null || head.next == null) {
            return head;
        }

        int index = 1;
        ListNode pre = null;
        ListNode cur = head;
        ListNode reverseStart = null;
        ListNode reverseEnd = null;
        ListNode tail = null;
        while (cur != null) {
            if (index == m) {
                reverseStart = cur;
            }
            if (index == n) {
                if (cur.next != null) {
                    tail = cur.next;
                }
                reverseEnd = cur;
                reverseEnd.next = null;
                break;
            }
            if (reverseStart == null) {
                pre = cur;
            }
            cur = cur.next;
            index++;
        }

        ListNode reverseHead = reverse(reverseStart);
        if (pre != null) {
            pre.next = reverseHead;
        }
        ListNode curReverse = reverseHead;
        while (curReverse.next != null) {
            curReverse = curReverse.next;
        }
        curReverse.next = tail;

        return pre == null ? reverseHead : head;
    }

    public static ListNode reverse(ListNode head) {
        ListNode pre = null;
        ListNode cur = head;
        while (cur != null) {
            ListNode temp = cur.next;
            cur.next = pre;
            pre = cur;
            cur = temp;
        }
        return pre;
    }

    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    public static ListNode generateLink(int[] nums) {
        if (nums == null || nums.length == 0) {
            return null;
        }
        ListNode head = new ListNode(nums[0]);
        ListNode cur = head;
        for (int i = 1; i < nums.length; i++) {
            cur.next = new ListNode(nums[i]);
            cur = cur.next;
        }
        return head;
    }

    public static void printLink(ListNode head) {
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
