package LeetCode.Easy;

public class LC437 {
    public static void main(String[] args) {

    }

    public int pathSum(TreeNode root, int sum) {
        if (root == null) return 0;
        return pathSumFromRoot(root, sum) + pathSum(root.left, sum) + pathSum(root.right, sum);
    }

    private int pathSumFromRoot(TreeNode root, int sum) {
        if (root == null) return 0;
        int total = 0;
        if (root.val == sum) total++;
        return total + pathSumFromRoot(root.left, sum - root.val) + pathSumFromRoot(root.right, sum - root.val);
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
