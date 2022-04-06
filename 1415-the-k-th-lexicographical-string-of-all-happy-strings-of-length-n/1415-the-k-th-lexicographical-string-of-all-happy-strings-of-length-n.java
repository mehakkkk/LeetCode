class Solution {
    public void permute(int n,char[] arr,StringBuilder s,List<String>list)
    {
        
        if(s.length() == n)
        {
            //System.out.println(s);
            list.add(s.toString());
            return;
        }
        
        for(int i=0;i<arr.length;i++)
        {
            if(s.length()!=0 && s.charAt(s.length()-1) == arr[i])
                continue;
            
            s.append(arr[i]);
            permute(n,arr,s,list);
            if(s.length()>0)
            s.deleteCharAt(s.length()-1);
        }
    }
    public String getHappyString(int n, int k) {
        char[] arr = {'a','b','c'};
        List<String>list = new ArrayList<>();
        permute(n,arr,new StringBuilder(),list);
        
        if(k<=list.size())
        {
            return list.get(k-1);
        }
        return "";
        
    }
}