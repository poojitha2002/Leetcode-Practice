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
    int ans=0,sum=0;
    public int sum1(TreeNode root,int sum)
    {
        if(root==null)
        {
            return ans; 
        }
        if(root.left==null && root.right==null)
        {
            int temp=sum*10+root.val;
            ans+=temp;
            return ans;
        }
        int temp=sum*10+root.val;
        sum1(root.left,temp);
        sum1(root.right,temp);
        return ans ;
        
    }
    public int sumNumbers(TreeNode root) {
      return sum1(root,0);
    }
}