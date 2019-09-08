package Sort.Tree;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class LayerSort {

    public static void main(String[] args) {
        int[] a = new int[]{0, 1, 2, 3, 4, 5, 6, 7};
        TreeNode tree = buildTree(a);
        layerSort(tree);
    }

    private static void layerSort(TreeNode tree) {
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(tree);
        while (!queue.isEmpty()) {
            TreeNode node = queue.poll();
            System.out.print(node.val + "->");
            if (node.left != null) {
                queue.add(node.left);
            }
            if (node.right != null) {
                queue.add(node.right);
            }
        }
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
