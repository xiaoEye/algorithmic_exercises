package LeetCode.Easy;

public class LC234 {

    public static void main(String[] args) {
        ListNode head = generateLink(new int[]{1, 2, 3, 2, 1});
        printLink(head);
        System.out.println(isPalindrome(head));
        printLink(head);
    }

    public static boolean isPalindrome(ListNode head) {
        if (head == null || head.next == null) return true;

        ListNode fast = head.next.next;
        ListNode slow = head.next;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        ListNode newHead = reverse(slow);
        ListNode tmp = newHead;
        ListNode newSlow = head;
        while (newHead != null) {
            if (newHead.val != newSlow.val) {
                return false;
            }
            newHead = newHead.next;
            newSlow = newSlow.next;
        }
        reverse(tmp);
        return true;
    }

    private static ListNode reverse(ListNode head) {
        ListNode prev = null;
        ListNode cur = head;
        while (cur != null) {
            ListNode temp = cur.next;
            cur.next = prev;
            prev = cur;
            cur = temp;
        }
        return prev;
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

    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }
}
