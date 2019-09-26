package LeetCode.Easy;

public class LC538 {

    public static void main(String[] args) {

    }

    private int sum = 0;

    public TreeNode convertBST(TreeNode root) {
        if (root == null) return null;
        inOrder(root);
        return root;
    }

    private void inOrder(TreeNode root) {
        if (root == null) return;
        inOrder(root.right);
        root.val += sum;
        sum = root.val;
        inOrder(root.left);
    }

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }
}
