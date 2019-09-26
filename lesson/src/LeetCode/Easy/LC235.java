package LeetCode.Easy;

public class LC235 {

    public static void main(String[] args) {

    }

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null) return null;
        if (p.val < q.val) {
            if (root.val > q.val) return lowestCommonAncestor(root.left, p, q);
            if (root.val < p.val) return lowestCommonAncestor(root.right, p, q);
        } else {
            if (root.val > p.val) return lowestCommonAncestor(root.left, p, q);
            if (root.val < q.val) return lowestCommonAncestor(root.right, p, q);
        }
        return root;
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
