object Solution {
    def sum(n:Int):Int={
        var n1=n;
        var s=0;
        while(n1>0)
        {
            s=s+(n1%10)*(n1%10);
            n1=n1/10;
        }
        return s;
    }
    def isHappy(n: Int): Boolean = {
        
        var n1=n;
      while(n1!=1 && n1!=4)
        {
            n1=sum(n1);
        }
        return n1==1;
    }
}