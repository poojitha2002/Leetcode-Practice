class Solution {
    public int minAddToMakeValid(String s) {
        int c=0;
        Stack<Character>st=new Stack<>();
        Stack<Character>st2=new Stack<>();
        for(int i=0;i<s.length();)
        {
            if(s.charAt(i)=='(')
            {
                i++;
                st.push('(');
            }
            else
            {
                System.out.println(st);
                if(st.isEmpty())
                {
                    System.out.println("*");
                    while(i<s.length())
                    {
                        if(s.charAt(i)==')')
                        {
                         //   System.out.println("i= "+i+" c= "+c);
                            i++;
                            c++;
                        }
                        else
                            break;
                        
                    }
                }
                System.out.println(c);
                while(!st.isEmpty() && st.peek()=='(' && i<s.length() && s.charAt(i)==')')
                {
                    st.pop();
                    i++;
                }
                
            }
        }
        System.out.println(st);
        System.out.println("c= "+c+" "+st.size());
        return c+st.size();
    }
}