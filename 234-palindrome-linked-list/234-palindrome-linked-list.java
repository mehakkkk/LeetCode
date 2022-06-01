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
    public boolean isPalindrome(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        
        //find middle
        while(fast.next!=null && fast.next.next != null)
        {
            fast = fast.next.next;
            slow = slow.next;
        }
        
        //reverse linked list from second half
        ListNode prev = null;
        slow = slow.next;
        ListNode temp = slow;
        
        while(slow != null)
        {
            temp = slow.next;
            slow.next = prev;
            prev = slow;
            slow = temp;
        }
        
        slow = prev;        
        ListNode curr = head;
        
        
        
        while(slow != null)
        {
            System.out.println(slow.val + " "+ curr.val);
            if(slow.val != curr.val)
                return false;
            
            slow = slow.next;
            curr = curr.next;
        }
        return true;
        
    }
}