class Solution {
    List<List<Integer>>res;
    void helper(int[] num,int target,int l,List<Integer>list)
    {
        if(l == num.length || target<0)
            return;
        
        if(target == 0)
        {
            res.add(new ArrayList<>(list));
            return;
        }
        
        list.add(num[l]);
        helper(num,target-num[l],l,list);
        
        if(list.size()!=0)
            list.remove(list.size()-1);
        
        helper(num,target,l+1,list);
        
        return;
    }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        res = new ArrayList<>();
        
        helper(candidates,target,0,new ArrayList<>());
        return res;
    }
}