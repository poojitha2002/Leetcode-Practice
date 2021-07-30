/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

class Solution {
    public ListNode reverse(ListNode head)
    {
        ListNode prev=null;
        ListNode temp=head;
        while(temp!=null)
        {
            ListNode cur=temp.next;
            temp.next=prev;
            prev=temp;
            temp=cur;
        }
        return prev;
    }
    public int[] nextLargerNodes(ListNode head) {
        ArrayList<Integer>a=new ArrayList<>();
        ListNode h=reverse(head);
        ListNode temp=h;
        Stack<Integer>st=new Stack<>();
        while(temp!=null)
        {
           if(!st.isEmpty())
           {
                while (!st.empty()&& st.peek() <= temp.val)
                {
                    st.pop();
                }
           }
            a.add(st.empty() ? 0 : st.peek());
            st.push(temp.val);
            temp=temp.next;
        }
        int []ar=new int[a.size()];
        int ui=0;
        for(int i=a.size()-1;i>=0;i--)
            ar[ui++]=a.get(i);
        return ar;
    }
}