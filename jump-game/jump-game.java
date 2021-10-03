class Solution {
    public int solve(int []a,int i,int []dp)
    {
        if(i==a.length-1)
            return dp[i]=1;
         
        if(i>a.length-1)
            return 0;
        if(dp[i]!=-1)
            return dp[i];
         if(a[i]==0)
             return dp[i]=0;
        int x=0;
        for(int j=1;j<=a[i];j++)
        {
            if(i+j<a.length && dp[i+j]!=-1)
            x=x|dp[i+j]; //=solve(a,i+j,dp));
            if(i+j<a.length && dp[i+j]==-1)
                x=x|(dp[i+j]=solve(a,i+j,dp));
        }
        return   dp[i]=x;
        
    }
    public boolean canJump(int[] nums) {
        int []dp=new int[nums.length];
        Arrays.fill(dp,-1);
        int v= solve(nums,0,dp);
        if(v==1)
            return true;
        return false;
        
    }
}