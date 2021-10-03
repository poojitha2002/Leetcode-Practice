object Solution {
  def longestCommonPrefix(strs: Array[String]): String = {
  if (strs.isEmpty) return ""

  val low: Int = strs.map(_.length).min

  for (size <- low until 0 by -1) {
    val z = strs.head.substring(0, size)

    if (strs.tail.forall(str => str.substring(0, size) == z)) {
      return z
    }
  }

  ""
}
}