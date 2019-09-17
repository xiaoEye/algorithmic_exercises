package LeetCode.Easy;

public class LC112_1 {

    public static void main(String[] args) {

    }

    public boolean hasPathSum(TreeNode root, int sum) {
        if (root == null) return false;
        if (root.val == sum && root.left == null && root.right == null) return true;
        if (hasPathSum(root.left, sum - root.val)) return true;
        if (hasPathSum(root.right, sum - root.val)) return true;
        return false;
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
