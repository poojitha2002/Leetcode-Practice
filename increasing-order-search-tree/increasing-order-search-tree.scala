/**
 * Definition for a binary tree node.
 * class TreeNode(_value: Int = 0, _left: TreeNode = null, _right: TreeNode = null) {
 *   var value: Int = _value
 *   var left: TreeNode = _left
 *   var right: TreeNode = _right
 * }
 */
object Solution {
  def increasingBST(root: TreeNode): TreeNode = {
    def traverse(r: TreeNode, acc: List[Int] = Nil): List[Int] =
      if (r != null) traverse(r.left, acc) ++ List(r.value) ++ traverse(r.right, acc)
      else acc
   def convert(xs: List[Int]): TreeNode = xs match {
      case Nil        => null
      case head :: tl => new TreeNode(head, null, convert(tl))
    }
   convert(traverse(root))
  }
}