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
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        //find ath node
        ListNode aNode = list1;
        
        for(int i =0;i<a-1;i++)
        {
            aNode = aNode.next;
        }
        
        //find bth
        ListNode bNode = list1;
        for(int i =0;i<=b;i++)
        {
            bNode = bNode.next;
        }
        
        //traverse second list till end
        
        ListNode curr = list2;
        while(curr.next!=null)
        {
            curr = curr.next;
        }
        aNode.next = list2;
        curr.next = bNode;
        
        return list1;
        
    }
}