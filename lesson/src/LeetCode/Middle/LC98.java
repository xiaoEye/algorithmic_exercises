package LeetCode.Middle;

import java.util.ArrayList;

public class LC98 {

    public static void main(String[] args) {

    }

    public boolean isValidBST(TreeNode root) {
        if (root == null) return true;
        ArrayList<Integer> list = new ArrayList<>();
        inSort(list, root);
        for (int i = 0; i < list.size() - 1; i++) {
            if (list.get(i) >= list.get(i + 1)) {
                return false;
            }
        }
        return true;
    }

    private static void inSort(ArrayList<Integer> list, TreeNode root) {
        if (root == null) return;
        inSort(list, root.left);
        list.add(root.val);
        inSort(list, root.right);
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
