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
    public ListNode swapPairs(ListNode head) {
        
         if(head==null || head.next==null)
             return head;
        ListNode x=head.next.next;
          head.next.next=null;
          
        ListNode prev=null;
        ListNode temp=head;
        while(temp!=null)
        {
            ListNode cur=temp.next;
            temp.next=prev;
            prev=temp;
            temp=cur;
        }
        head.next=swapPairs(x);
        return prev;
        
    }
}