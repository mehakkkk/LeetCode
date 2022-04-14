class Solution {
    
    List<String>list;
    void helper(String digits,int l,StringBuilder s,String[] arr)
    {
        if(l == digits.length())
        {
            list.add(s.toString());
            return;
        }
        
        String val = arr[digits.charAt(l)-'0'];
                         
        for(int i=0;i<val.length();i++)
         {
             s.append(val.charAt(i));
             helper(digits,l+1,s,arr);
             s.deleteCharAt(s.length()-1);
         }
    }
    public List<String> letterCombinations(String digits) {
        if(digits.length() == 0 )
            return new ArrayList<>();
        String[] arr ={"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        list = new ArrayList<>();
        helper(digits,0,new StringBuilder(),arr);
        return list;
    }
}