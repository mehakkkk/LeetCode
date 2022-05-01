class Solution {
    public int findNumbers(int[] nums) {
        int count = 0;
        
        for(int i =0;i<nums.length;i++)
        {
            int num = nums[i];
            int digit = 0;
            
            while(num>0)
            {
                num = num/10;
                digit++;
            }
            count += (digit%2)==0?1:0;
        }
        return count;
        
    }
}