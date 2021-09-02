class Solution {
public:
  static  bool cmp(string a,string b)
    {
      if(a.length()==b.length())
          return a>b;
        if(a+b<b+a)
            return false;
        return true;
        
    }
    string largestNumber(vector<int>& nums) {
        vector<string>a;
        for(int i=0;i<nums.size();i++)
            a.push_back(to_string(nums[i]));
        sort(a.begin(),a.end(),cmp);
        string res="";
        for(int i=0;i<a.size();i++)
            res+=a[i];
        cout<<res<<endl;
        string v="";
        int i=0;
        for(  i=0;i<res.length();i++)
            if(res[i]=='0')
                continue;
            else
            {
                v=res.substr(i);
                break;
            }
        if(i==res.length())
            return "0";
        return v;
    }
};