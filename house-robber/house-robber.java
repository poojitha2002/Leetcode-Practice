class Solution {
    int rec(int []a,int i,int []dp)
    {
        if(i>=a.length)
            return 0;
        if(dp[i]!=-1)
            return dp[i];
        int ch1=a[i]+rec(a,i+2,dp);
        int c2=rec(a,i+1,dp);
        return dp[i]=Math.max(ch1,c2);
    }
    public int rob(int[] nums) {
        int []dp=new int[nums.length];
        for(int i=0;i<nums.length;i++)
            dp[i]=-1;
       return rec(nums,0,dp);
        
    }
}