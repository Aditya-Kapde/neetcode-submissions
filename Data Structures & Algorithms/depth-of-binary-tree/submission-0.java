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
        int cd=1,md=0;
        if(root.left!= null)
        {
            cd=1;
            cd+=maxDepth(root.left);
            md=(md>cd)?md:cd;
        }
        if(root.right!= null)
        {
            cd=1;
            cd+=maxDepth(root.right);
            md=(md>cd)?md:cd;
        }
        md=(md>cd)?md:cd;
        return md;
    }
}
