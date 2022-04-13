class Solution {
    List<List<Integer>>res;
    void helper(int n,int k,int l,List<Integer>list)
    {
        if(list.size() == k)
        {
            res.add(new ArrayList<>(list));
            return;
        }
        
        if(l>n || list.size()>k)
            return;
        
        list.add(l);
        helper(n,k,l+1,list);
        
        if(list.size()!=0)
            list.remove(list.size()-1);
        
        helper(n,k,l+1,list);
    }
    public List<List<Integer>> combine(int n, int k) {
        res = new ArrayList<>();
        helper(n,k,1,new ArrayList<>());
        return res;
        
    }
}