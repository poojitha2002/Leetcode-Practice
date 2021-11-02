class Solution {
    public int ans(int[][]a,int i,int j,int [][]dp)
    {
        if(i>=a.length || j>=a[0].length)
            return 0;
        if(a[i][j]==1)
            return 0;
        if(i==a.length-1 && j==a[0].length-1)
            return 1;
        
         
      //  int op1=0,op2=0;
         if(dp[i][j]!=-1)
             return dp[i][j];
        int op1=ans(a,i+1,j,dp);
        int op2=ans(a,i,j+1,dp);
        return dp[i][j]=op1+op2;
    }
    public int uniquePathsWithObstacles(int[][] og) {
        int [][]dp=new int[og.length][og[0].length];
        for(int i=0;i<dp.length;i++)
        {
            for(int j=0;j<dp[0].length;j++)
                dp[i][j]=-1;
        }
        return ans(og,0,0,dp);
    }
}