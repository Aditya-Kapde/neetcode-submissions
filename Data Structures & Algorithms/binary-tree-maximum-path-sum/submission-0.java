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
    private int max = Integer.MIN_VALUE;
    public int maxPathSum(TreeNode root) {
        maxGain(root);
        return max;
    }

    private int maxGain(TreeNode node)
    {
        if(node == null) return 0;

        int left_Gain=Math.max(0, maxGain(node.left));
        int right_Gain=Math.max(0, maxGain(node.right));

        int currPath=node.val+left_Gain+right_Gain;

        max=Math.max(max, currPath);

        return node.val+Math.max(left_Gain, right_Gain);
    }
}
