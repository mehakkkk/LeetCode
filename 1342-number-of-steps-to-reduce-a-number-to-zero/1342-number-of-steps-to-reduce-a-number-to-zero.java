class Solution {
    //using iterative approach
    public int iterative(int num)
    {
         int count = 0;
        while(num>0)
        {
            if(num%2 ==0)
                num = num/2;
            else
                num-=1;
            
            count++;
        }
        return count;
    }
    
    //using bit manipulation
    public int bitManipulation(int nums)
    {
        int count =0;
        while(nums>0)
        {
            //check last bit
            //if 0 then right shift
            if((nums & 1) == 0)
            {
                nums = nums>>1;
            }
            else
            {
                nums = nums-1;
            }
            count++;
        }
        return count;
            
           
    }
    public int numberOfSteps(int num) {
       //return iterative(num);
        return bitManipulation(num);
    }
}