//{ Driver Code Starts
import java.util.Scanner;
import java.util.Stack;
class SortedStack{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
			Stack<Integer> s=new Stack<>();
			int n=sc.nextInt();
			while(n-->0)
			s.push(sc.nextInt());
			GfG g=new GfG();
			Stack<Integer> a=g.sort(s);
			while(!a.empty()){
				System.out.print(a.peek()+" ");
				a.pop();
			}
			System.out.println();
		}
	}
}
// } Driver Code Ends


/*Complete the function below*/
class GfG{
    public Stack<Integer> insert(Stack<Integer>stack,int ele)
    {
        if(stack.size() == 0 || stack.peek()<=ele)
        {
            stack.push(ele);
            return stack;
        }
        
        int top = stack.pop();
        
        Stack<Integer>resStack = insert(stack,ele);
        
        resStack.push(top);
        return resStack;
    }
	public Stack<Integer> sort(Stack<Integer> stack)
	{
		if(stack.isEmpty())
		    return stack;
		    
	    int top = stack.pop();
	    sort(stack);
	    
	    return insert(stack,top);
	    
	}
}