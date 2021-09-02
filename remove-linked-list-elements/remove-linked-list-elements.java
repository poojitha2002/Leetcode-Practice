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
    public ListNode removeElements(ListNode head, int val) {
       ListNode h=null,tail=null;
        ListNode temp=head;
        while(temp!=null)
        {
            if(temp.val==val)
                temp=temp.next;
            else
            {
                ListNode x=new ListNode(temp.val);
               // System.out.println(x.val);
                if(h==null)
                {
                    
                    h=x;
                    tail=x;
                }
                else
                {
                    tail.next=x;
                    tail=x;
                }
                temp=temp.next;
            }
        }
        return h;
    }
}