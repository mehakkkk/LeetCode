class Solution {
    int t;
    List<List<Integer>>sol;
    void generateCombination(int[] nums,int sum,int l,List<Integer>ans)
    {
        if(sum<0)
            return;
        
        if(sum!= t && l == nums.length)
            return;
        
        if(sum == 0)
        {
            sol.add(new ArrayList<>(ans));
            return;
        }
        
        for(int i=l;i<nums.length;i++)
        {
            ans.add(nums[i]);
            System.out.println("num:"+nums[i]+" target:"+(sum-nums[i]));
            generateCombination(nums,sum-nums[i],i,ans);
            ans.remove(ans.size()-1);
        }
    }
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        t = target;
        
        sol = new ArrayList<>();
        generateCombination(nums,t,0,new ArrayList<Integer>());
        return sol;
    }
}