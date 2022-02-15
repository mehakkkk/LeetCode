class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        
        //using brute force
        // for(int i=1;i<arr.length-1;i++)
        // {
        //     if(arr[i]>arr[i-1] && arr[i]>arr[i+1])
        //         return i;
        // }
        
        //using binary search
        int l =0;
        int h = arr.length-1;
        while(l<h)
        {
            int mid = (l+h)/2;
            
            if(arr[mid]>arr[mid-1] && arr[mid]>arr[mid+1])
                return mid;
            else if(arr[mid]<arr[mid+1])
                l = mid+1;
            else
                h = mid;
        }
        
        return 0;
        
    }
}