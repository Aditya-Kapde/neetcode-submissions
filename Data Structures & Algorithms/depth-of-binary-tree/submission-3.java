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
    public int maxDepth(TreeNode root) {
        if(root == null) return 0;
        int cd=1, fd=0;
        if(root.left != null)
        {
            cd=1;
            cd+=maxDepth(root.left);
            fd=(fd>cd)?fd:cd;
        }
        
        if(root.right != null)
        {
            cd=1;
            cd+=maxDepth(root.right);
            fd=(fd>cd)?fd:cd;
        }
    
        fd=(fd>cd)?fd:cd;
        
        return fd;
    }
}
