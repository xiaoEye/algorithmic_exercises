package LeetCode.Easy;

import java.util.LinkedList;
import java.util.List;

public class LC572 {

    public static void main(String[] args) {
        int[] a = new int[]{3, 4, 5, 1, 2, 123, 123, 0};
        TreeNode s = buildTree(a);
        int[] b = new int[]{4, 1, 2};
        TreeNode t = buildTree(b);
        System.out.println(isSubtree(s, t));
    }

    public static boolean isSubtree(TreeNode s, TreeNode t) {
        if (s == null) return false;
        return subTreeFromRoot(s, t) || isSubtree(s.left, t) || isSubtree(s.right, t);
    }

    private static boolean subTreeFromRoot(TreeNode s, TreeNode t) {
        if (s == null && t == null) return true;
        if (s == null || t == null) return false;
        if (s.val != t.val) return false;
        return subTreeFromRoot(s.left, t.left) && subTreeFromRoot(s.right, t.right);
    }

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    private static TreeNode buildTree(int[] a) {
        List<TreeNode> trees = new LinkedList<>();
        for (int i = 0; i < a.length; i++) {
            if (a[i] == 123) {
                trees.add(null);
            } else {
                trees.add(new TreeNode(a[i]));
            }
        }
        for (int i = 0; i < a.length / 2; i++) {
            trees.get(i).left = trees.get(2 * i + 1);
            if (2 * i + 2 < a.length) {
                trees.get(i).right = trees.get(2 * i + 2);
            }
        }
        return trees.get(0);
    }
}
