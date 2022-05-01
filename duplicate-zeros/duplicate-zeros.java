class Solution {
    public void duplicateZeros(int[] arr) {
        int skip = 0,i;
        
        for(i =0;i<arr.length&&(i+skip)<arr.length;i++)
        {
            skip+= ((arr[i]==0)?1:0);
        }
        
        
        for(i =i-1;skip>0;i--)
        {
            if (i + skip < arr.length) arr[i + skip] = arr[i];
            if (arr[i] == 0) arr[i + --skip] = arr[i];
        }
        
        
    }
}