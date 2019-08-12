package NewCoder.LinkList;

public class ReverListNode {
    public static void main(String[] args) {

    }

    //逆序
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
