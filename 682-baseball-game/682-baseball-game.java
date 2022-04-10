class Solution {
    public int calPoints(String[] ops) {
        Stack<Integer>stack = new Stack<>();
        
        int sum =0;
        
        for(int i=0;i<ops.length;i++)
        {
            String c = ops[i];
            if(c.equals("+"))
            {
                int x = stack.pop();
                int y = x+stack.peek();
                sum+=y;
                
                stack.push(x);
                stack.push(y);
                
            }
            else if(c.equals("C"))
            {
                sum-=stack.pop();
            }
            else if(c.equals("D"))
            {
                sum+= (2*stack.peek());
                stack.push(2*stack.peek());
            }
            else 
            {
                sum+=Integer.parseInt(c);
                stack.push(Integer.parseInt(c));
            }
        }
         
       return sum;
                           
        
    }
}