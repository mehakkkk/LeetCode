class Solution {
    public int firstOccur(int[] nums,int target)
    {
        int l =0;
        int h = nums.length-1;
        int ans = -1;
        
        while(l<=h)
        {
            int mid = (l+h)/2;
            
            if(nums[mid] == target)
            {
                ans = mid;
                h = mid-1;
            }
            else if(nums[mid]<target)
            {
                l = mid+1;
            }
            else
            {
                h = mid-1;
            }
        }
        return ans;
    }
    
    public int lastOccur(int[] nums,int target)
    {
        int l =0;
        int h = nums.length-1;
        int ans = -1;
        
        while(l<=h)
        {
            int mid = (l+h)/2;
            
            if(nums[mid] == target)
            {
                ans = mid;
                l = mid+1;
            }
            else if(nums[mid]<target)
            {
                l = mid+1;
            }
            else
            {
                h = mid-1;
            }
        }
        return ans;
    }
    
    
    public int[] searchRange(int[] nums, int target) {
        
        int[] ans = new int[2];
        ans[0] = firstOccur(nums,target);
        ans[1] = lastOccur(nums,target);
        
        return ans;
    }
}