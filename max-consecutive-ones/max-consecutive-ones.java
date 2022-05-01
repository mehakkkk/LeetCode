class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count =0;
        int k = 0;
        for(int i =0;i<nums.length;i++)
        {
            if(nums[i] == 1)
            {
                k++;
            }
            else
            {
                
                k = 0;
            }
            count = Math.max(count,k);
        }
        return count;
        
    }
}