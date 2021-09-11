class Solution {
    public int lengthOfLongestSubstring(String s) {
        
        int c=0;
        int ma=0;
        
        int []a=new int[127];
        int j=0,i;
        for(  i=0;i<s.length();)
        {
            if(a[s.charAt(i)]==0)
            {
                a[s.charAt(i)]++;
               
                i++;
            }
            else
            {
                ma=Math.max(ma,i-j);
                while(j<i && a[s.charAt(i)]>0)
                {
                    a[s.charAt(j)]--;
                    j++;
                }
                 
            }
        }
        ma=Math.max(ma,i-j);
        return ma;
    }
  
}