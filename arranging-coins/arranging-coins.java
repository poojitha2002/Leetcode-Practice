class Solution {
    public int arrangeCoins(int n) {
        int current=1;
        int noOfRowsTillNow=0;
        while(n-current>=0)
        {
            n=n-current;
            noOfRowsTillNow++;
            current++;
        }
        return noOfRowsTillNow;
    }
}