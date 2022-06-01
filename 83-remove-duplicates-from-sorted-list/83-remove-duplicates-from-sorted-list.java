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
    public ListNode deleteDuplicates(ListNode head) {
        //corner case: [1,1,1]
        if(head == null)
            return head;
        ListNode curr = head;
        while(curr != null && curr.next != null)
        {
            if(curr.val == curr.next.val)
            {
                curr.next = curr.next.next; // if same remove the next node and dont move to the next pointer to satisfy corner case
            }
            else // if not same move to next
            curr = curr.next;
            
        }
        
        return head;
        
    }
}