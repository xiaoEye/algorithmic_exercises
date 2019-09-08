package LeetCode.Easy;

import java.util.ArrayList;
import java.util.List;

public class LC112 {

    public static void main(String[] args) {

    }

//    public boolean hasPathSum(TreeNode root, int sum) {
//        if (root == null)
//            return false;
//
//        sum -= root.val;
//        if ((root.left == null) && (root.right == null))
//            return (sum == 0);
//        return hasPathSum(root.left, sum) || hasPathSum(root.right, sum);
//    }

    public boolean hasPathSum(TreeNode root, int sum) {
        List<Boolean> list = new ArrayList<>();
        pathSum(root, sum, list);
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i)) {
                return true;
            }
        }
        return false;
    }

    private void pathSum(TreeNode root, int sum, List<Boolean> list) {
        if (root == null) {
            list.add(false);
            return;
        }
        if (sum - root.val == 0 && root.left == null && root.right == null) {
            list.add(true);
            return;
        }
        if (root.left != null) {
            pathSum(root.left, sum - root.val, list);
        }
        if (root.right != null) {
            pathSum(root.right, sum - root.val, list);
        }
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
