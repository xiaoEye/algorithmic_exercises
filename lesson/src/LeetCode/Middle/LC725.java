package LeetCode.Middle;

public class LC725 {

    public static void main(String[] args) {
        ListNode head = generateLink(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10});
        printLink(head);
        ListNode[] listNodes = splitListToParts(head, 3);
        for (int i = 0; i < listNodes.length; i++) {
            printLink(listNodes[i]);
        }
    }

    public static ListNode[] splitListToParts(ListNode root, int k) {
        ListNode[] listNodes = new ListNode[k];

        int length = 0;
        ListNode cur = root;
        while (cur != null) {
            length++;
            cur = cur.next;
        }

        int size = length / k == 0 ? 1 : length / k;
        int mod = length / k == 0 ? 0 : length % k;

        int index = 0;
        while (root != null) {
            listNodes[index++] = root;
            cur = root;

            int sizeTemp = (mod-- > 0) ? size + 1 : size;
            while (sizeTemp-- > 1) {
                cur = cur.next;
            }

            root = cur.next;
            cur.next = null;
        }

        return listNodes;
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
