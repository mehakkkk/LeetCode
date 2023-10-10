//{ Driver Code Starts
import java.util.Scanner;
import java.io.*;

class Node
{
    int data;
    Node next;
    Node(int d)
    {
        data=d;
        next=null;
    }
}
class GFG1 {
    public static void printList(Node head)
    {
        Node start=head;
        System.out.print(head.data+" ");
        head=head.next;
        while(head!=start)
        {
            System.out.print(head.data+" ");
            head=head.next;
        }
        System.out.println();
    }
	public static void main (String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int t=sc.nextInt();
	    while(t-->0)
	    {
	        int n=sc.nextInt();
	        Node start=null,cur=null;
	        for(int i=0;i<n;i++)
	        {
	            int a=sc.nextInt();
	            Node ptr=new Node(a);
	            if(start==null)
	            {
	                start=ptr;
	                cur=ptr;
	            }
	            else
	            {
	                cur.next=ptr;
	                cur=ptr;
	            }
	        }
	        int delNode=sc.nextInt();
	        cur.next=start;
	        GFG obj=new GFG();
	        Node head=obj.deleteNode(start,delNode);
	        start=obj.reverse(head);
	        printList(start);
	    }
	}
}
// } Driver Code Ends


/*class Node
{
    int data;
    Node next;
    Node(int d)
    {
        data=d;next=null;
    }
}*/

class GFG
{
    //This method returns the head of the LL after deleting node with value d.
    public static Node deleteNode(Node head,int d)
    {
        Node curr = head;
        Node temp = head;
        
        while(curr !=null)
        {
            temp = curr;
            curr = curr.next;
            
            if(curr.data == d)
            {
                temp.next = curr.next;
                break;
            }
        }
        if(curr == head)
            return head.next;
        return head;
    }
    //This method returns the head node of the reversed Linked list.
    public static Node reverse(Node head)
    {
        Node curr = head;
        Node prev = null;
        //System.out.println("reverse");
        
        while(curr.next != head)
        {
            //System.out.println(curr.data);
            Node temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }
        curr.next = prev;
        head.next = curr;
        return curr;
    }
}