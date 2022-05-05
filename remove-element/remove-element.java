import java.util.*;
class Solution {
    public int removeElement(int[] nums, int val) {
        int i = 0,k=0;
        int j = nums.length-1;
        
        while(i<=j)
        {
            if(nums[i] == val)
            {
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                j--;
                k++;
            }
            else
                i++;
        }
        
        // System.out.println("i: "+i+" j: "+j+" k: "+k);
        // for(i=0;i<nums.length;i++)
        // {
        //     System.out.println(i+" "+nums[i]);
        // }
        return i;
        
        
    }
}