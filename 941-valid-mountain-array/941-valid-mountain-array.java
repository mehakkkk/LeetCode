class Solution {
    public boolean validMountainArray(int[] arr) {
        if(arr.length<3)
            return false;
        
        int i =0,j = arr.length-1;
        
        while(i+1<arr.length && arr[i]<arr[i+1] )
        {
            i++;
            
        }
        
        while( j-1>=0 &&arr[j-1]>arr[j])
        {
            j--;
        }
        
        
        if(i!=0 && j!=arr.length-1 && i == j )
            return true;
        
        return false;
        
    }
}