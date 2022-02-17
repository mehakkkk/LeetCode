class Solution {
    List<List<Integer>> ans;
    void generateSubSet(int[] nums,List<Integer>subset,int l)
    {
        if(l == nums.length)
            return;
        
        for(int i=l;i<nums.length;i++)
        {
            subset.add(nums[i]);
            ans.add(new ArrayList<>(subset));
            generateSubSet(nums,subset,i+1);
            subset.remove(subset.size()-1);
        }
    }
    public List<List<Integer>> subsets(int[] nums) {
        ans = new ArrayList<>();
        ans.add(new ArrayList<>());
        generateSubSet(nums,new ArrayList<>(),0);
        return ans;
        
    }
}