class Solution {
    public void sortColors(int[] nums) {
        int l =0,mid=0;
        int h = nums.length-1;
        
        while(mid<=h)
        {
            
            if(nums[mid] == 0)
            {
                int temp = nums[mid];
                nums[mid] = nums[l];
                nums[l] = temp;
                l++;
                mid++;
            }
            else if(nums[mid] == 1)
                mid++;
            else if(nums[mid] == 2)
            {
                int temp = nums[h];
                nums[h] = nums[mid];
                nums[mid] = temp; 
                h--;
            }
        }
        
    }
}