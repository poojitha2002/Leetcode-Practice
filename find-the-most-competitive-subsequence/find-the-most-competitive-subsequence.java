class Solution {
    public int[] mostCompetitive(int[] nums, int k) {
        int []ans=new int[k];
        Stack<Integer>st=new Stack<>();
        for(int i=0;i<nums.length;i++)
        {
            while(!st.isEmpty() && nums[i]<nums[st.peek()] && nums.length+st.size()-(i)>k)
            {
                st.pop();
            }
            if(st.size()<k)
                st.push(i);
        }
        int i=k-1;
        while(!st.isEmpty())
        {
            ans[i--]=nums[st.pop()];
        }
            return ans;
    }
}