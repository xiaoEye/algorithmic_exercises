package LeetCode.Easy;

import java.util.LinkedList;
import java.util.Queue;

public class LC101 {

    public static void main(String[] args) {

    }

    //迭代
    public boolean isSymmetric(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        queue.add(root);
        while (!queue.isEmpty()) {
            TreeNode t1 = queue.poll();
            TreeNode t2 = queue.poll();
            if (t1 == null && t2 == null) continue;
            if (t1 == null || t2 == null) return false;
            if (t1.val != t2.val) return false;
            queue.add(t1.left);
            queue.add(t2.right);
            queue.add(t1.right);
            queue.add(t2.left);
        }
        return true;
    }

    //递归
//    public boolean isSymmetric(TreeNode root) {
//        if (root == null) return true;
//        return isSymmetric(root.left, root.right);
//    }
//
//    private boolean isSymmetric(TreeNode s, TreeNode t) {
//        if (s == null && t == null) return true;
//        if (s == null || t == null) return false;
//        if (s.val != t.val) return false;
//        return isSymmetric(s.left, t.right) && isSymmetric(s.right, t.left);
//    }

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }
}
