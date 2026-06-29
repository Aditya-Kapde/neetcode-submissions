/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

class Solution {
    final int INF = 1001;

    public boolean isValidBST(TreeNode root) {
        return isBST(root);
    }

    private boolean isBST(TreeNode root) {
        if (root == null) return true;

        if (root.left != null) {
            int leftMax = maxNode(root.left);
            if (root.val <= leftMax) return false;
        }

        if (root.right != null) {
            int rightMin = minNode(root.right);
            if (root.val >= rightMin) return false;
        }

        return isBST(root.left) && isBST(root.right);
    }

    private int maxNode(TreeNode root) {
        int maxVal = root.val;
        if (root.left != null) {
            maxVal = Math.max(maxVal, maxNode(root.left));
        }
        if (root.right != null) {
            maxVal = Math.max(maxVal, maxNode(root.right));
        }
        return maxVal;
    }

    private int minNode(TreeNode root) {
        int minVal = root.val;
        if (root.left != null) {
            minVal = Math.min(minVal, minNode(root.left));
        }
        if (root.right != null) {
            minVal = Math.min(minVal, minNode(root.right));
        }
        return minVal;
    }
}
