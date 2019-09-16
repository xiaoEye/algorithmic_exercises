package LeetCode.Easy;

import java.util.LinkedList;

public class LC160 {

    public static void main(String[] args) {

    }

    //双指针法
    //时间复杂度 : O(m+n)
    //空间复杂度 : O(1)
    public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA == null || headB == null) {
            return null;
        }

        ListNode curA = headA;
        ListNode curB = headB;
        while (curA != curB) {
            curA = curA == null ? headB : curA.next;
            curB = curB == null ? headA : curB.next;
        }

        return curA;
    }

    // 暴力法
    // 时间复杂度 : O(mn)
    // 空间复杂度 : O(1)
//    public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {
//        if (headA == null || headB == null) {
//            return null;
//        }
//
//        while (headA != null) {
//            ListNode curB = headB;
//            while (curB != null) {
//                if (headA == curB) {
//                    return headA;
//                }
//                curB = curB.next;
//            }
//
//            headA = headA.next;
//        }
//
//        return null;
//    }

    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }
}
