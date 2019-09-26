package LeetCode.Middle;

public class LC236 {

    public static void main(String[] args) {

    }

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null || root == p || root == q) return root;
        TreeNode left = lowestCommonAncestor(root.left, p, q);
        TreeNode right = lowestCommonAncestor(root.right, p, q);
        return left == null ? right : right == null ? left : root;
    }

//    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
//        if (root == null) return null;
//        if (isExist(root.left, p) && isExist(root.left, q)) return lowestCommonAncestor(root.left, p, q);
//        if (isExist(root.right, p) && isExist(root.right, q)) return lowestCommonAncestor(root.right, p, q);
//        return root;
//    }
//
//    private boolean isExist(TreeNode root, TreeNode node) {
//        if (root == null) return false;
//        if (root.val == node.val) return true;
//        if (isExist(root.left, node)) return true;
//        if (isExist(root.right, node)) return true;
//        return false;
//    }

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }
}
