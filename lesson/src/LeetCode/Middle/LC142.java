package LeetCode.Middle;

public class LC142 {

    public static void main(String[] args) {
        ListNode head = generateLink(new int[]{1, 2, 3, 4, 5, 6});
        printLink(head);
        System.out.println(detectCycle(head));
    }

    public static ListNode detectCycle(ListNode head) {
        if (head == null) {
            return null;
        }

        ListNode slow = head;
        ListNode fast = head;

        boolean isExist = false;
        while (slow.next != null && fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                isExist = true;
                break;
            }
        }

        if (isExist) {
            // 可以用数学证明两者必然相遇
            ListNode newSlow = head;
            while (newSlow != slow) {
                newSlow = newSlow.next;
                slow = slow.next;
            }
            return newSlow;

//            ListNode newSlow = head;
//            while (newSlow.next != null) {
//
//                if (newSlow.next == slow.next) {
//                    if (newSlow == slow){
//                        return newSlow;
//                    }else {
//                        return newSlow.next;
//                    }
//                }
//                slow = slow.next;
//
//                while (slow != fast) {
//                    if (newSlow.next == slow.next) {
//                        if (newSlow == slow){
//                            return newSlow;
//                        }else {
//                            return newSlow.next;
//                        }
//                    }
//                    slow = slow.next;
//                }
//
//                newSlow = newSlow.next;
//            }
        }
        return null;
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
