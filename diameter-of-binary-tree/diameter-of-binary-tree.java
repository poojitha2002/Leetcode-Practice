class Solution {
    
    int max;
    
    public int rec(TreeNode root){
        if(root == null)
            return 0;
        int left = rec(root.left), right = rec(root.right);
        max = Math.max(max,left+right);
        return 1 + Math.max(left,right);
    }
    
    public int diameterOfBinaryTree(TreeNode root){
        max = 0;
        rec(root);
        return max;
    }
}