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

// This is the Inorder traversal of the Tree 
class Solution {
    public int kthSmallest(TreeNode root, int k) {
        List<Integer> list = new ArrayList<>();

        inorder_dfs(root, list);
        return list.get(k-1);

    }

    private static void inorder_dfs(TreeNode root, List<Integer> list)
    {
        if(root == null)
        {
            return;
        }

        inorder_dfs(root.left, list);
        list.add(root.val);
        inorder_dfs(root.right, list);

    }
}
