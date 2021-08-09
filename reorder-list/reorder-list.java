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
public class Solution {
    public void reorderList(ListNode head) {
        if (head==null||head.next==null) return;
        Deque<ListNode> st = new ArrayDeque<ListNode>();
        ListNode ptr=head;
        while (ptr!=null) {
            st.push(ptr); ptr=ptr.next;
        }
        int cnt=(st.size()-1)/2;
        ptr=head;
        while (cnt-->0) {
            ListNode top = st.pop();
            ListNode tmp = ptr.next;
            ptr.next=top;
            top.next=tmp;
            ptr=tmp;
        }
        st.pop().next=null;
    }
}