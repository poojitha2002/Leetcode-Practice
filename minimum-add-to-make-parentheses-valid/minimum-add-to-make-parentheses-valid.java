class Solution {
    public int minAddToMakeValid(String s) {
        int c=0;
        Stack<Character>st=new Stack<>();
        
        for(int i=0;i<s.length();)
        {
            if(s.charAt(i)=='(')
            {
                i++;
                st.push('(');
            }
            else
            {
                 if(st.isEmpty())
                { 
                    while(i<s.length())
                    {
                        if(s.charAt(i)==')')
                        {
                        
                            i++;
                            c++;
                        }
                        else
                            break;
                        
                    }
                }
               
                while(!st.isEmpty() && st.peek()=='(' && i<s.length() && s.charAt(i)==')')
                {
                    st.pop();
                    i++;
                }
                
            }
        } 
        return c+st.size();
    }
}