package NewCoder.LinkList;

import java.util.Stack;

public class Palindrome {

    public static void main(String[] args) {
        // {1,2,3,2,1}
        // {1,2,3,2,1,0}
        // {1,2,3,2}
    }

    public boolean isPalindrome(ListNode pHead) {
        // write code here
        if (pHead == null || pHead.next == null) {
            return true;
        }
        ListNode fast = pHead, slow = pHead;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        //逆置部分链表
        ListNode pre = reverListNode(slow);
        ListNode p = pre;

        slow = pHead;
        fast = pre;
        boolean res = true;
        while (pre != null) {
            if (pre.val != slow.val) {
                res = false;
                break;
            }
            pre = pre.next;
            slow = slow.next;
        }

        //再次逆置部分链表
        reverListNode(p);

        return res;

//        ListNode cur = pHead;
//        ListNode head = pHead;
//        Stack<ListNode> stack = new Stack<>();
//        while (cur != null) {
//            stack.push(cur);
//            cur = cur.next;
//        }
//        int size = stack.size();
//        ListNode listNode = null;
//        for (int i = 0; i < size; i++) {
//            listNode = stack.pop();
//            if (listNode.val != head.val) {
//                return false;
//            }
//            head = head.next;
//        }
//        return true;
    }

    public ListNode reverListNode(ListNode root) {
        ListNode pre = null;
        ListNode next = null;
        while (root != null) {
            next = root.next;
            root.next = pre;
            pre = root;
            root = next;
        }

        return pre;
    }

    public class ListNode {
        int val;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }
}

