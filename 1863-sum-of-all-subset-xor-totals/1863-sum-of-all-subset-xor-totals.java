class Solution {
    public int helper(int[] nums,int l,int sum)
    {
        if(l>=nums.length)
            return sum;
        
        int include = helper(nums,l+1,sum ^ nums[l]);
        int exclude = helper(nums,l+1,sum);
        
        return include+exclude;
    }
    public int subsetXORSum(int[] nums) {
        return helper(nums,0,0);
        
    }
}