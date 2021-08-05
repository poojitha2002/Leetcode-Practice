class Solution {
    public int numTeams(int[] rating) {
        int sum=0;
        
        for(int i=0;i<rating.length;i++)
        {
            int small=0,large=0,s1=0,l1=0;
            for(int j=0;j<i;j++)
            {
                if(rating[j]<rating[i])
                {
                    small++;
                }
            }
            for(int j=i+1;j<rating.length;j++)
            {
                if(rating[j]>rating[i])
                {
                    large++;
                }
            }
            for(int j=0;j<i;j++)
            {
                if(rating[j]>rating[i])
                {
                    l1++;
                }
            }
            for(int j=i+1;j<rating.length;j++)
            {
                if(rating[j]<rating[i])
                {
                    s1++;
                }
            }
            sum+=(small*large)+(l1*s1);
            
        }
        return sum;
    }
}