/**
 * Definition for a binary tree node.
 * class TreeNode(_value: Int = 0, _left: TreeNode = null, _right: TreeNode = null) {
 *   var value: Int = _value
 *   var left: TreeNode = _left
 *   var right: TreeNode = _right
 * }
 */
object Solution {
    def maxDepth(root: TreeNode): Int = {
        if (root==null)
        return 0;
        var right=1+maxDepth(root.right);
        var left=1+maxDepth(root.left);
        if(right>left)
        return right;
        return left;
       
    }
}
 