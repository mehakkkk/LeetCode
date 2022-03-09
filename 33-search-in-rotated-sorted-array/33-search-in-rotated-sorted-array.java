class Solution {
    public int search(int[] nums, int target) {
        int l =0;
        int h = nums.length-1;
        
        while(l<=h)
        {
            int mid = (l+h)/2;
            
            if(nums[mid] == target)
                return mid;
            
            //make use of fact one side of the array is sorted and in increasong order
            if(nums[l]<=nums[mid])
            {
                if(nums[l]<=target && nums[mid]>target)
                {
                    h = mid-1;
                }
                else
                {
                    l = mid+1;
                }
            }
            
            if(nums[h]>=nums[mid])
            {
                if(nums[mid]<target && nums[h]>=target)
                {
                    l = mid+1;
                }
                else
                {
                    h = mid-1;
                }
            }
        }
        return -1;
        
        
    }
}