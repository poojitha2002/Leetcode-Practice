class Solution {
    public int[] singleNumber(int[] nums) {
        int []result=new int[2];
        Arrays.fill(result,0);
        int d=0;
        for(int num : nums)
        {
            d=d^num;
        }
        d = d & (-d);
        for(int num : nums)
        {
            if( (num & d) > 0)
                result[0]^=num;
            else
                result[1]^=num;
        }
        return result;
    }
}