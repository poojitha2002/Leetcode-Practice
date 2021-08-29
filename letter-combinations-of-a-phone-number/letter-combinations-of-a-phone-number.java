class Solution {
    public void letter(List<String>l,String d,String p,int i,String []map)
    {
        if(i>=d.length())
        {
            l.add(p);
            return ;
        }
        String lee=map[d.charAt(i)-'0'];
        for(int i1=0;i1<lee.length();i1++)
        {
            letter(l,d,p+lee.charAt(i1),i+1,map);
        }
    }
    public List<String> letterCombinations(String digits) {
        List<String>l=new ArrayList<>();
        if(digits.length()==0)
            return l;
        String []map={"0","1","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        letter(l,digits,"",0,map);
        return l;
    }
}