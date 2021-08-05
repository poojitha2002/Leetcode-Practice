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
    public ListNode partition(ListNode head, int x) {
        ListNode h1=null;
        ListNode t1=null;
        ListNode h2=null;
        ListNode t2=null;
        x=x-1;
        ListNode temp=head;
        while(temp!=null)
        {
            ListNode temp1=new ListNode(temp.val);
            if(temp.val<=x)
            {
                if(h1==null)
                {
                    h1=temp1;
                    t1=temp1;
                }
                else
                {
                    t1.next=temp1;
                    t1=temp1;
                }
            }
            else
            {
                if(h2==null)
                {
                    h2=temp1;
                    t2=temp1;
                }
                else
                {
                    t2.next=temp1;
                    t2=temp1;
                }
            }
            temp=temp.next;
        }
        if(h1==null)
            return h2;
        t1.next=h2;
        return h1;
    }
}