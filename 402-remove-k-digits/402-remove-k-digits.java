class Solution {
    public String removeKdigits(String num, int k) {
        if(k == 0 || num.length() == 0)
            return "0";
        
        Stack<Character>stack = new Stack<>();
        
        for(int i=0;i<num.length();i++)
        {
            Character c = num.charAt(i);
            
            while(k>0 && !stack.isEmpty() && stack.peek()>c)
            {
                stack.pop();
                k--;
            }
            stack.push(c);
        }
        
        while(k>0)
        {
            stack.pop();
            k--;
        }
        
        String res = "";
        while(!stack.isEmpty())
        {
            res = stack.pop() + res;
        }
        
        
        while(res.length()>0 && res.charAt(0) == '0')
        {
            res = res.substring(1);
        }
        System.out.println(res);
        
        return res == ""?"0":res;
        
        
    }
}