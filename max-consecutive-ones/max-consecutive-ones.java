class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int c=0;
        int max=0;
        for(int i=0;i<nums.length-1;i++)
        {
            if(nums[i]==nums[i+1] && nums[i]==1)
            {
                c++;
            }
            else
            {
                if(nums[i]==1)
                    c++;
                if(c>max)
                    max=c;
                c=0;
            }
        }
        if(nums[nums.length-1]==1)
            c++;
           if(c>max)
                    max=c;
        return max;
    }
}