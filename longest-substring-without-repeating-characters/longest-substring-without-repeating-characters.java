class Solution {
    public int lengthOfLongestSubstring(String s) {
        
        HashMap<Character,Integer>hm=new HashMap<>();
        int i=0;
        int max=0;
        for(int j=0;j<s.length();j++)
        {
            if(hm.get(s.charAt(j))==null)
            {
                hm.put(s.charAt(j),1);
            }
            else
            {
                if(hm.size()>max)
                    max=hm.size();
                while(i<j && hm.get(s.charAt(j))!=null)
                {
                     
                    if(hm.get(s.charAt(i))==1)
                        hm.remove(s.charAt(i));
                        
                        i++;
                }
                
                hm.put(s.charAt(j),1);
                 if(hm.size()>max)
                    max=hm.size();
            }
        }
         if(hm.size()>max)
             max=hm.size();
        return max;
             
    }
  
}