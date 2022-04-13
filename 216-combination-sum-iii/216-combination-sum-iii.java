class Solution {
    List<List<Integer>>res;
    void helper(int k,int target,int l,List<Integer>list)
    {
        if(target == 0 && k == 0)
        {
            res.add(new ArrayList<>(list));
            return;
        }
        
        if(l>=10 || target<0 || k<0)
            return;
        
        
        //System.out.println("l: "+l+" target: "+target+" k: "+k);
        
        list.add(l);
        helper(k-1,target-l,l+1,list);
        
        if(list.size()!=0)
        {
            list.remove(list.size()-1);
        }
        
        helper(k,target,l+1,list);
    }
    public List<List<Integer>> combinationSum3(int k, int n) {
        res = new ArrayList<>();
        helper(k,n,1,new ArrayList<>());
        return res;
        
    }
}