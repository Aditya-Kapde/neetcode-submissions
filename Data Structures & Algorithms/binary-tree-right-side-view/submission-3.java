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
    List<List<Integer>> list=new ArrayList<>();
    List<Integer> result=new ArrayList<>();

    public List<Integer> rightSideView(TreeNode root) 
    {
        dfs(root, 0);
        rightSideView();

        return result;
    }

    public void dfs(TreeNode root, int depth)
    {
        if(root==null) return ;
        if(list.size()==depth)
        {
            list.add(new ArrayList<>());
        }
        list.get(depth).add(root.val);
        dfs(root.left, depth+1);
        dfs(root.right, depth+1);
    }

    public void rightSideView()
    {
        
        int n=list.size();
        for(int i=0; i<n;i++)
        {
            int m=list.get(i).size();
            result.add(list.get(i).get(m-1));
        }
        
    }
}













