class Solution {
    public int maxProduct(int[] nums) {
        if(nums.length==0)
            return 0;
         int max_so_far=nums[0];  // -4
         int min_so_far=nums[0];  // -4
         int maxo=nums[0];        // -4
        for(int i=1;i<nums.length;i++)
        {
            
            int t=max_so_far; 
            max_so_far=Math.max(nums[i],Math.max(max_so_far*nums[i],min_so_far*nums[i]));
            min_so_far=Math.min(nums[i],Math.min(t*nums[i],min_so_far*nums[i]));
            maxo=Math.max(max_so_far,maxo);
            //System.out.print(max_so_far+" "+min_so_far+" "+maxo+" "+t+"\n");
        }
        return maxo;
    }
}

 
