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
    public int sum(TreeNode root,boolean isLeft)
    {
        // If the tree is empty, sum is 0.
        if(root==null)
            return 0;
        // If current node is leaf node and if it is left node, then return its value
        if(root.left==null && root.right==null && isLeft==true)
         return root.val;
        // Perform the same on left and right subtrees, and return their sum. Whenever calling left subtree, pass true as isLeft, because its on left.
        return sum(root.left,true)+sum(root.right,false);
    }
    public int sumOfLeftLeaves(TreeNode root) {
        // If the tree is empty, sum is 0.
        if(root==null)
            return 0;
        // Perform the same on left and right subtrees, and return their sum. Whenever calling left subtree, pass true as isLeft, because its on left.
        return sum(root.left,true)+sum(root.right,false); 
     
    }
}