class Solution {
    public int longestSubarray(int[] nums) {
        int i=0, j=0, z=0, o=0;
    	int res=0;
    	while(i<nums.length && j<nums.length)
    	{
    		if(nums[j]==1)
	    		o++;
    		else z++;
    		
    		while(z >1)
    		{
    			if(nums[i]==0)
    				z--;
    			else
    				o--;
    			i++;
    		}
    		res= Math.max(res, o);
    		j++;
    	}
        if(res==nums.length)
            return res-1;
        return res;
    	 
    }
}