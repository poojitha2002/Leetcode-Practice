import java.util.*;
class Solution {
    public int maxProfit(int[] prices) {
        int ma=0;
        int minsofar=prices[0];
        for(int i=1;i<prices.length;i++)
        {
            if(prices[i]-minsofar>ma)
                ma=prices[i]-minsofar;
            if(prices[i]<minsofar)
                minsofar=prices[i];
        }
        return ma;
    }
    
}