class Solution {
    Set<List<Integer>>res;
    public void helper(int[] nums,boolean[] visit,List<Integer>list)
    {
        if(list.size() == nums.length)
        {
            res.add(new ArrayList<>(list));
            return;
        }
        
        for(int i =0;i<nums.length;i++)
        {
            if(!visit[i])
            {
                list.add(nums[i]);
                visit[i] = true;
                helper(nums,visit,list);
                visit[i] = false;
                list.remove(list.size()-1);
            }
        }
    }
    
    public List<List<Integer>> permuteUnique(int[] nums) {
        res = new HashSet<>();
        helper(nums,new boolean[nums.length],new ArrayList<>());
        return new ArrayList(res);
    }
}