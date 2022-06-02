class Node
{
    Node prev,next;
    String val;
    
    public Node(String val)
    {
        next = null;
        prev = null;
        this.val = val;
    }
}

class BrowserHistory {

    Node head = null;
    Node curr = null;
    Node prevTab = null;
    Node nextTab = null;
    public BrowserHistory(String homepage) {
        head = new Node(homepage);
        curr = head;
        
    }
    
    public void visit(String url) {
        curr.next = new Node(url);
        curr.next.prev = curr;
        curr = curr.next;
    }
    
    public String back(int steps) {
        while(steps-->0 && curr.prev != null)
        {
           curr = curr.prev;
        }
        return curr.val;
        
    }
    
    public String forward(int steps) {
        while(steps-->0 && curr.next != null)
        {
            curr = curr.next;
        }
        return curr.val;
        
    }
}

/**
 * Your BrowserHistory object will be instantiated and called as such:
 * BrowserHistory obj = new BrowserHistory(homepage);
 * obj.visit(url);
 * String param_2 = obj.back(steps);
 * String param_3 = obj.forward(steps);
 */