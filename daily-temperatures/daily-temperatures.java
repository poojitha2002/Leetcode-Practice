class Solution {
    public int[] dailyTemperatures(int[] temp) {
    Stack<Integer> st = new Stack<>();
    int[] ret = new int[temp.length];
    for(int i = 0; i < temp.length; i++) {
        while(!st.isEmpty() && temp[i] > temp[st.peek()]) {
            int idx=st.pop();
            ret[idx]=i-idx;
        }
        st.push(i);
    }
    return ret;
}
}