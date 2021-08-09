class Solution {
    public String minRemoveToMakeValid(String s) {
        if(s.length() == 0 || s == null){
            return "";
        }
        StringBuilder sb = new StringBuilder(s);
        Stack<Integer> st = new Stack<>();
        for(int i = 0; i < s.length(); ++i){
            char ch = s.charAt(i);
            if(ch == '('){
                st.push(i);
            }else if(ch == ')'){
                if(st.size() == 0){
                    st.push(i);
                }else{
                    if(s.charAt(st.peek()) == '('){
                        st.pop(); 
                    }else{
                        st.push(i);  
                    }
                }
            }
        }
        while(st.size() > 0){
            sb.deleteCharAt(st.pop()); 
        }
        return sb.toString();
    }
}