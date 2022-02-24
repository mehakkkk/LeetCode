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
    ListNode merge(ListNode head1,ListNode head2)
    {
        if(head1 == null && head2 == null)
            return null;
        else if(head1 == null && head2!=null)
            return head2;
        else if(head2 == null && head1!=null)
            return head1;
        
        ListNode head=null;
        if(head1.val<=head2.val)
        {
            head = head1;
            head.next = merge(head1.next,head2);
        }
        else
        {
            head = head2;
            head.next = merge(head1,head2.next);
        }
        return head;
    }
    public ListNode sortList(ListNode head) {
        
        if(head == null || head.next == null)
            return head;
        //find middle
        ListNode slow = head;
        ListNode fast = head;
        
        while(fast.next!=null && fast.next.next!=null)
        {
            slow = slow.next;
            fast = fast.next.next;
        }
        
        fast = slow.next;
        slow.next = null;
        ListNode left = sortList(head);
        ListNode right = sortList(fast);
        head = merge(left,right);
        return head;
    }
}