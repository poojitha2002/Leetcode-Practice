object Solution {
   
   def constructRectangle(area: Int): Array[Int] = {
    var x = Math.sqrt(area).toInt
    while(area % x != 0) 
       x =x- 1;
    Array(area / x, x)
  }
}