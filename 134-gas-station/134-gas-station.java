class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int i =0;
        int sum = 0,curr =0,start =0;
        
        for(i=0;i<gas.length;i++) {
            curr += gas[i]-cost[i];
            sum += gas[i]-cost[i];
            // if we are not able to reach next station from i, 
            if(curr < 0) {
                start = i+1;
                curr = 0;
            }
        }
        
        return sum >= 0 ? start : -1;
        
        
        
    }
}