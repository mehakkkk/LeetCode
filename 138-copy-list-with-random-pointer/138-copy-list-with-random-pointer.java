/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        if(head == null)
            return null;
        
        Node curr = head;
        Node temp = null;
        
        
        //first loop add dummy pointers with same value to next of curr pointer
        while(curr!=null)
        {
            temp = new Node(curr.val);
            temp.next = curr.next;
            curr.next = temp;
            curr = curr.next.next;
        }
        
        //second loop to assign random pointers to dummy nodes
        curr = head;
        Node newHead = null;
        while(curr!=null)
        {
            temp = curr.next;
            //System.out.println(temp.val);
            if(curr.random!=null)
            {
                temp.random = curr.random.next;
            }
            
            curr = curr.next.next;
        }
        
        //third loop to segregate both lists i.e new list is alternate nodes
        curr = head;
        newHead = curr.next;
        
        temp =newHead;
        
        while(temp.next!=null)
        {
            curr.next = temp.next;
            curr = curr.next;
            temp.next = curr.next;
            temp = curr.next;
        }
        
        curr.next = curr.next.next;
        
        
        return newHead;
        
        
    }
}