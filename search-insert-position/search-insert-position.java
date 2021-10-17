class Solution {
    public int searchInsert(int[] nums, int target) {
         int l=0;
        int h=nums.length-1;
        if(nums[nums.length-1]<target)
        {
            return nums.length;
        }
        if(target<nums[0])
        {
            return 0;
        }
        while(l<=h)
        {
            int mid=(l+h)/2;
            if(nums[mid]==target)
                return mid;
            else if(nums[mid]>target)
            {
                h=mid-1;
            }
            else
            {
                if(mid+1<nums.length && nums[mid]<target && target<nums[mid+1])
                    return mid+1;
                else
                    l=mid+1;
            }
        }
        return 0;
    }
}