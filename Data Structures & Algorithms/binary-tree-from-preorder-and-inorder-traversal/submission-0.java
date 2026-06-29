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
 *         thi s.right = right;
 *     }
 * }
 */

class Solution {
    Map<Integer, Integer> inorderIndex = new HashMap<>();
    int preIndex=0;
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        
        for(int i=0; i<inorder.length; i++)
        {
            inorderIndex.put(inorder[i], i);

        }

        return helper(preorder, 0, inorder.length-1);
        
    }

    private TreeNode helper(int[] preorder, int start, int end)
    {
        
        if(start>end) return null;

        int rootval=preorder[preIndex++];
        TreeNode root = new TreeNode(rootval);


        int index = inorderIndex.get(rootval);

        root.left= helper(preorder, start, index-1);
        root.right= helper(preorder, index+1, end);

        return root;
        
    }
}
