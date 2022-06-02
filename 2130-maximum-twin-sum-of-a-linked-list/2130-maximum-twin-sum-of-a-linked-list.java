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
    public int pairSum(ListNode head) {
        //find middle of linkedlist
        ListNode fast = head;
        ListNode slow = head;
        
        while(fast.next!=null&& fast.next.next!=null)
        {
            fast = fast.next.next;
            slow = slow.next;
        }
        
        //reverse the latter part of the list
        slow = slow.next;
        ListNode prev = null;
        ListNode temp = slow;
        while(slow!=null)
        {
            temp = slow.next;
            slow.next = prev;
            prev = slow;
            slow = temp;
        }
        
        int max = Integer.MIN_VALUE;
        //using two-pointer for first and latter half
        fast = head;
        slow = prev;
        while(slow!=null)
        {
            max = Math.max(max,slow.val+fast.val);
            slow = slow.next;
            fast = fast.next;
        }
        
        return max;
        
    }
}