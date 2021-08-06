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
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer>a=new ArrayList<>();
        Queue<TreeNode>q=new LinkedList<>();
        if(root==null)
            return a;
        q.add(root);
        while(!q.isEmpty())
        {
            int size=q.size();
            for(int i=0;i<size;i++)
            {
                TreeNode p=q.poll();
                if(p.left!=null)
                    q.add(p.left);
                if(p.right!=null)
                    q.add(p.right);
                if(i==size-1)
                {
                    a.add(p.val);
                }
                
            }
        }
        return a;
    }
}