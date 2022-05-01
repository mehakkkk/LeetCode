class Solution {
    public boolean backspaceCompare(String s, String t) {
        Stack<Character>stack = new Stack<>();
        
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i) == '#' && !stack.isEmpty())
                stack.pop();
            else if(s.charAt(i) != '#')
            stack.push(s.charAt(i));
        }
        
        s="";
        while(!stack.empty())
        {
            s+=stack.pop();
        }
        
        for(int i=0;i<t.length();i++)
        {
            if(t.charAt(i) == '#'  && !stack.isEmpty())
                stack.pop();
            else if(t.charAt(i)!='#')
            stack.push(t.charAt(i));
        }
        
        t="";
        while(!stack.empty())
        {
            t+=stack.pop();
        }
        
        System.out.println(s+" "+t);
        
        return s.equals(t);
        
    }
}