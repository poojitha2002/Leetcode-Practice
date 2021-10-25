/**
 * Definition for singly-linked list.
 * class ListNode(_x: Int = 0, _next: ListNode = null) {
 *   var next: ListNode = _next
 *   var x: Int = _x
 * }
 */
object Solution {
    def isPalindrome(head: ListNode): Boolean = {
        var temp=head;
        var x1="";
        while(temp!=null)
        {
            x1=x1+(temp.x+"");
            temp=temp.next;
        }
        var x2=x1.reverse;
        if(x1==x2)
        return true;
        return false;
    }
}




 