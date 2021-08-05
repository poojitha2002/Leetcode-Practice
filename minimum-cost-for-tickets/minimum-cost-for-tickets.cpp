class Solution {
public:
     int dp[366];
    int fn(int idx,vector<int>&days,vector<int>&costs)
    {
        if(idx>=days.size())
            return 0;
         if(dp[idx]!=-1)
             return dp[idx];
        dp[idx]=INT_MAX;
        int ch1=costs[0]+fn(idx+1,days,costs);
        // ch1
        dp[idx]=min(dp[idx],ch1);
        // ch2
        int ch2=upper_bound(days.begin(),days.end(),days[idx]+6)-days.begin();
        dp[idx]=min(dp[idx],costs[1]+fn(ch2,days,costs));
        
         // ch3
        int ch3=upper_bound(days.begin(),days.end(),days[idx]+29)-days.begin();
        dp[idx]=min(dp[idx],costs[2]+fn(ch3,days,costs));
        return dp[idx];
    }
    int mincostTickets(vector<int>& days, vector<int>& costs) {
        
        memset(dp,-1,sizeof(dp));
        int ans=fn(0,days,costs);
        return ans;
    }
};