package LeetCode.Easy;

public class LC404 {

    public static void main(String[] args) {

    }

    public int sumOfLeftLeaves(TreeNode root) {
        if (root == null) return 0;
        if (isLeaf(root.left)) return root.left.val + sumOfLeftLeaves(root.right);
        return sumOfLeftLeaves(root.left) + sumOfLeftLeaves(root.right);
    }

    private boolean isLeaf(TreeNode node) {
        if (node == null) return false;
        return node.left == null && node.right == null;
    }


//    private int sum = 0;
//
//    public int sumOfLeftLeaves(TreeNode root) {
//        if (root == null) return 0;
//        sumOfLeft(root.left, true);
//        sumOfLeft(root.right, false);
//        return sum;
//    }
//
//    private void sumOfLeft(TreeNode root, boolean isLeft) {
//        if (root == null) return;
//        if (root.left == null && root.right == null) {
//            if (isLeft) {
//                sum += root.val;
//            }
//            return;
//        }
//        sumOfLeft(root.left, true);
//        sumOfLeft(root.right, false);
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
