package LeetCode.Easy;

public class LC21 {

    public static void main(String[] args) {
        ListNode head1 = generateLink(new int[]{1, 2, 4});
        ListNode head2 = generateLink(new int[]{1, 3, 4});
        printLink(head1);
        printLink(head2);
        ListNode newHead = mergeTwoLists(head1, head2);
        printLink(newHead);

    }

    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null) {
            return l2;
        }
        if (l2 == null) {
            return l1;
        }

        ListNode newHead = null;
        ListNode newCur = null;
        ListNode curL1 = l1;
        ListNode curL2 = l2;

        while (curL1 != null && curL2 != null) {
            if (curL1.val < curL2.val) {
                if (newHead == null) {
                    newHead = new ListNode(curL1.val);
                    newCur = newHead;
                } else {
                    newCur.next = new ListNode(curL1.val);
                    newCur = newCur.next;
                }
                curL1 = curL1.next;
            } else {
                if (newHead == null) {
                    newHead = new ListNode(curL2.val);
                    newCur = newHead;
                } else {
                    newCur.next = new ListNode(curL2.val);
                    newCur = newCur.next;
                }
                curL2 = curL2.next;
            }

            if (curL1 == null) {
                newCur.next = curL2;
            }
            if (curL2 == null) {
                newCur.next = curL1;
            }
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
            System.out.print("->");
            head = head.next;
        }
        System.out.println();
    }
}




