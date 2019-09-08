package Sort.Tree;

import java.util.LinkedList;
import java.util.List;

public class PreAndInAndPostOrder {

    public static void main(String[] args) {
        int[] a = new int[]{0, 1, 2, 3, 4, 5, 6, 7};
        TreeNode tree = buildTree(a);
        preOrder(tree);
        System.out.println();
        inOrder(tree);
        System.out.println();
        postOrder(tree);
        System.out.println();
    }

    private static void preOrder(TreeNode tree) {
        if (tree == null) return;
        System.out.print(tree.val + "->");
        preOrder(tree.left);
        preOrder(tree.right);
    }

    private static void inOrder(TreeNode tree) {
        if (tree == null) return;
        inOrder(tree.left);
        System.out.print(tree.val + "->");
        inOrder(tree.right);
    }

    private static void postOrder(TreeNode tree) {
        if (tree == null) return;
        postOrder(tree.left);
        postOrder(tree.right);
        System.out.print(tree.val + "->");
    }

    private static TreeNode buildTree(int[] a) {
        List<TreeNode> trees = new LinkedList<>();
        for (int i = 0; i < a.length; i++) {
            trees.add(new TreeNode(a[i]));
        }
        for (int i = 0; i < a.length / 2; i++) {
            trees.get(i).left = trees.get(2 * i + 1);
            if (2 * i + 2 < a.length) {
                trees.get(i).right = trees.get(2 * i + 2);
            }
        }
        return trees.get(0);
    }

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }
}
