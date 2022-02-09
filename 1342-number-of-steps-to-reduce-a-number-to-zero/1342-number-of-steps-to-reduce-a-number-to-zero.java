class Solution {
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
    public int numberOfSteps(int num) {
       return iterative(num);
        
    }
}