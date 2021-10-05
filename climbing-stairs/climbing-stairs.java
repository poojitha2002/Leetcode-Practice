class Solution {
    public int climbStairs(int n) {
     
        int []a=new int[n+1];
        a[1]=1;
        if(n==1)
            return a[1];
        a[2]=2;
        for(int i=3;i<=n;i++)
            a[i]=a[i-1]+a[i-2];
        return a[n];
    }
}