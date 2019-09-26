package LeetCode.Easy;

import java.util.LinkedList;
import java.util.List;

public class LC108 {

    public static void main(String[] args) {

    }

    public TreeNode sortedArrayToBST(int[] nums) {
        return toBST(nums, 0, nums.length - 1);
    }

    private TreeNode toBST(int[] nums, int low, int high) {
        if (low > high) return null;
        int mid = low + ((high - low) >> 1);
        TreeNode root = new TreeNode(nums[mid]);
        root.left = toBST(nums, low, mid - 1);
        root.right = toBST(nums, mid + 1, high);
        return root;
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
