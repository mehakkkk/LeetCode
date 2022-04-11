class Solution {
    public void helper(int n,int open,int close,String s,List<String>list)
    {
        if(s.length() == n*2)
        {
            //System.out.println(s);
            if(isValid(s))
            {
                list.add(s);
            }
            return;
        }
        else{
            //if(open<n)
            helper(n,open++,close,s+"(",list);
            //if(close<open)
            helper(n,open,close--,s+")",list);
        }
        
       
    }
    
    public boolean isValid(String s)
    {
        int curr = 0;
        
        for(int i =0;i<s.length();i++)
        {
            if(s.charAt(i) == '(')
                curr++;
            else
                curr--;
            if(curr<0)
                return false;
        }
        
        return (curr == 0);
    }
    
    
    public List<String> generateParenthesis(int n) {
        List<String>list = new ArrayList<>();
        helper(n,0,0,"",list);
        return list;
    }
}