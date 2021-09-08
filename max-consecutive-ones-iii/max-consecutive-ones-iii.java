class Solution {
    public int longestOnes(int[] nums, int k) {
      int zeros=0;
      int res=0;
       int i=0;
        for(int j=0;j<nums.length;j++)
        {
            if(nums[j]==0)
            {
                zeros++;
            }
            if(zeros>k)
            {
                while(zeros>k)
                {
                    if(nums[i]==0)
                    {
                        zeros--;
                        
                    }
                    i++;
                }
            }
            res=Math.max(res,j-i+1);
        }
      
        
        
        
        return res;
    }
}