class Solution {
    public static void solve( List<String>a,int left,int right,String s)
    {
        if(left==0 && right==0)
        {
            a.add(s);
            return ;
        }
        if(left>0)
            solve(a,left-1,right,s+"(");
        if(left<right && right>0)
            solve(a,left,right-1,s+")");
    }
    public List<String> generateParenthesis(int n) {
        List<String>a=new ArrayList<>();
        solve(a,n,n,"");
        return a;
    }
}