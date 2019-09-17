package LeetCode.Easy;

public class LC110 {

    public static void main(String[] args) {

    }

    public static boolean isBalanced(TreeNode root) {
        if (root == null) return true;
        if (!isBalanced(root.left)) return false;
        if (!isBalanced(root.right)) return false;
        if (Math.abs(getHeight(root.left) - getHeight(root.right)) <= 1) {
            return true;
        } else {
            return false;
        }
    }

    private static int getHeight(TreeNode root) {
        if (root == null) return 0;
        return Math.max(getHeight(root.left), getHeight(root.right)) + 1;
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
