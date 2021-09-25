class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer,Integer>hs=new HashMap<>();
        int co=0;
        int sum=0;
        for(int i=0;i<nums.length;i++)
        {
            sum+=nums[i];
            if(sum==k)
                co++;
            if(hs.get(sum-k)!=null)
                co+=hs.get(sum-k);
            if(hs.get(sum)==null)
                hs.put(sum,1);
            else
                hs.put(sum,hs.get(sum)+1);
        }
        return co;
    }
}