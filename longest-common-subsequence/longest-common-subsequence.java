class Solution {
    public int longestSubsequence(String a,String b,int i,int j,int [][]dp)
    {
        if(j==b.length())
            return 0;
        if(i==a.length())
            return 0;
        if(dp[i][j]!=-1)
            return dp[i][j];
        if(a.charAt(i)==b.charAt(j))
        {
            return dp[i][j]=1+longestSubsequence(a,b,i+1,j+1,dp);
        }
        else
            return dp[i][j]=Math.max(longestSubsequence(a,b,i+1,j,dp),longestSubsequence(a,b,i,j+1,dp));
    }
    public int longestCommonSubsequence(String text1, String text2) {
        int n1=text1.length();
        int n2=text2.length();
        int [][]dp=new int[n1][n2];
        for(int i=0;i<n1;i++)
        {
            for(int j=0;j<n2;j++)
                dp[i][j]=-1;
        }
        return longestSubsequence(text1,text2,0,0,dp);
    }
}