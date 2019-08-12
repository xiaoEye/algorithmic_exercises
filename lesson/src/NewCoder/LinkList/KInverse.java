package NewCoder.LinkList;

import org.w3c.dom.NodeList;

import java.util.Stack;

public class KInverse {

    public static void main(String[] args) {
        // 1->2->3->4->5->6->7->8->null
        // 3->2->1->6->5->4->7->8->null

        // {0,1,2,5,11},2
        // {1,0,5,2,11}
    }

    public ListNode inverse(ListNode head, int k) {
        if (head == null) {
            return null;
        }
        if (!isEnough(head, k)) {
            return head;
        }

        ListNode cur = head;
        ListNode newHead = null;
        ListNode newCur = null;
        Stack<ListNode> stack = new Stack<>();
        while (cur != null) {
            if (!isEnough(cur, k)) {
                newCur.next = cur;
                break;
            }
            for (int i = 0; i < k; i++) {
                if (cur != null) {
                    stack.push(cur);
                    cur = cur.next;
                }
            }
            // 重点是结束之前的链表关系
            for (int i = 0; i < k; i++) {
                if (newHead == null) {
                    newHead = stack.pop();
                    newHead.next = null;
                    newCur = newHead;
                } else {
                    newCur.next = stack.pop();
                    newCur.next.next = null;
                    newCur = newCur.next;
                }
            }
        }
        return newHead;
    }

    private boolean isEnough(ListNode head, int k) {
        int count = 0;
        for (int i = 0; i < k; i++) {
            if (head != null) {
                count++;
                head = head.next;
            }
        }
        if (count == k) {
            return true;
        } else {
            return false;
        }
    }

    public class ListNode {
        int val;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }
}
