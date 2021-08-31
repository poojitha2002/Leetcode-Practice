object Solution {
    def isPalindrome(x: Int): Boolean = {
        if(x<0)
        return false;
        var p=x.toString
        var i=0;
        
        var j=p.length()-1;
        while(i<j)
        {
            if(p.charAt(i)!=p.charAt(j))
            return false;
            i+=1;
            j-=1;
        }
        return true;
        
    }
}