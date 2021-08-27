
class Solution {
    static int mod=1000000007;
    public long   solver(char[][]x,int n,int i,int j, long [][][]dp)
    {
        if(i>=4 || j>=3)
            return 0;
        if(i<0 || j<0)
            return 0;
        if(dp[i][j][n]!=-1)
            return dp[i][j][n]%mod;
        if(!Character.isDigit(x[i][j]))
            return dp[i][j][n]=0;
        
        if(n==0)
            return dp[i][j][n]=1;
            
return dp[i][j][n]=(solver(x,n-1,i-2,j+1,dp)%mod+solver(x,n-1,i-1,j+2,dp)%mod+solver(x,n-1,i+1,j+2,dp)%mod+solver(x,n-1,i+2,j+1,dp)%mod+solver(x,n-1,i+2,j-1,dp)%mod+solver(x,n-1,i+1,j-2,dp)%mod+solver(x,n-1,i-1,j-2,dp)%mod+solver(x,n-1,i-2,j-1,dp)%mod)%mod;
        
    }
    public int knightDialer(int n) {
        char [][]ch=new char[4][3];
        char x='1';
        for(int i=0;i<4;i++)
        {
            for(int j=0;j<3;j++)
            {
                ch[i][j]=x;
                x+=1;
            } 
        }
        long c=0;
        ch[3][0]='*';
        ch[3][2]='#';
        ch[3][1]='0';
        long [][][]dp=new long[4][3][n];
        for(int i=0;i<4;i++)
        {
            for(int j=0;j<3;j++)
                for(int k=0;k<n;k++)
                dp[i][j][k]=-1;
        }
        for(int i=0;i<4;i++)
        {
            for(int j=0;j<3;j++)
            {
                
                long p=solver(ch,n-1,i,j,dp);
                c+=p;
                c%=mod;
                
            }
        }
       return (int) c%mod;
    }
}