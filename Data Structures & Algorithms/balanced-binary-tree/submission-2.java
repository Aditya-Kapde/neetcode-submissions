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
    public boolean isBalanced(TreeNode root) {
        return Balanced(root);
    }
    private boolean Balanced(TreeNode root)
    {
        if(root == null) return true;
        boolean temp=true;
        if((Math.abs(height(root.left)-height(root.right))<=1) && Balanced(root.left) && Balanced(root.right))
        {
            temp=true;
        }
        else return false;
        return temp;
    }

    private int height(TreeNode root)
    {
        if(root==null) return 0;
        return 1+Math.max(height(root.left), height(root.right));
    }
}
