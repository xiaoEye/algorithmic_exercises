package NewCoder.LinkList;

import java.util.Vector;

public class Common {

    public static void main(String[] args) {
        //{1,2,3,4,5,6,7},{2,4,6,8,10}
        //[2.4.6]
    }

    public int[] findCommonParts(ListNode headA, ListNode headB) {
        if (headA == null || headB == null) {
            return null;
        }

        Vector<Integer> common = new Vector<>();
        ListNode curA = headA;
        ListNode curB = headB;
        while (curA != null && curB != null) {
            if (curA.val == curB.val) {
                common.add(curA.val);
                curA = curA.next;
                curB = curB.next;
            } else if (curA.val < curB.val) {
                curA = curA.next;
            } else {
                curB = curB.next;
            }
        }
        if (common.size() == 0) {
            return null;
        }
        int[] nums = new int[common.size()];
        for (int i = 0; i < common.size(); i++) {
            nums[i] = common.get(i);
        }
        return nums;
    }

    public class ListNode {
        int val;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }
}
