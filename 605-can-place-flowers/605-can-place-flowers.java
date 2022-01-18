class Solution {
    public boolean isSafe(int[] flowerbed,int i)
    {
        if(i == 0 && ( flowerbed.length ==1 || flowerbed[i+1] == 0 ))
            return true;
        if(i == flowerbed.length-1 && flowerbed[i-1] == 0)
            return true;
        if(i!=0 && i!=flowerbed.length-1 && flowerbed[i-1] == 0 && flowerbed[i+1] == 0 )
            return true;
        
        return false;
    }
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        if(n ==0)
            return true;
        
        for(int i=0;i<flowerbed.length;i++)
        {
            if(flowerbed[i] == 0 && isSafe(flowerbed,i))
            {
                flowerbed[i] = 1;
                n--;
            }
            
            if(n == 0)
                return true;
        }
        
        return false;
    }
}