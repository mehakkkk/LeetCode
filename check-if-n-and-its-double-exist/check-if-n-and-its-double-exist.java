class Solution {
    public boolean checkIfExist(int[] arr) {
        Set<Integer>set = new HashSet<>();
        
        for(int i=0;i<arr.length;i++)
        {
            int twice = arr[i]*2;
            int half = (arr[i]/2);
            
            if(set.contains(twice) || (arr[i]%2 == 0 && set.contains(half)))
            {
                return true;
            }
            
            set.add(arr[i]);
        }
        return false;
        
    }
}