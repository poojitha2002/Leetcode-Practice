object Solution {
    def num2letter(d:String) = {
        d match {
            case  "2"=> "abc"
            case  "3"=> "def"
            case  "4"=> "ghi"
            case  "5"=> "jkl"
            case  "6"=> "mno"
            case  "7"=> "pqrs"
            case  "8"=> "tuv"
            case  "9"=> "wxyz"
            case _ => ""
        }
    }
    def letterCombinations(digits: String): List[String] = {
        val letters = digits.split("").map(num2letter).toList
        letters.foldLeft(List(""))( (l, x) => for (li <- l; xi<-x) yield {li + xi} )  
    }
}