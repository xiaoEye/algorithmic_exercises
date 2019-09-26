package LeetCode.Middle;

import java.util.ArrayList;
import java.util.List;

public class LC230 {

    public static void main(String[] args) {

    }

    public int kthSmallest(TreeNode root, int k) {
        List<Integer> list = new ArrayList<>();
        inSort(root, list, k);
        return list.get(k - 1);
    }

    private void inSort(TreeNode root, List<Integer> list, int k) {
        if (root == null) return;
        inSort(root.left, list, k);
        list.add(root.val);
        if (list.size() == k) return;
        inSort(root.right, list, k);
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
