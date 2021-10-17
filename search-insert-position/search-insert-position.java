class Solution {
    public int searchInsert(int[] nums, int target) {
        int l=0;
        int h=nums.length-1;
        if(nums[0]>target)
            return 0;
        if(nums[nums.length-1]<target)
            return nums.length;
        while(l<=h)
        {
            int mid=(l+h)/2;
            if(nums[mid]==target)
                return mid;
            if(mid+1<nums.length && nums[mid]<target && nums[mid+1]>target)
                return mid+1;
            if(nums[mid]>target)
                h=mid-1;
            else
                l=mid+1;
        }
        return 0;
    }
}