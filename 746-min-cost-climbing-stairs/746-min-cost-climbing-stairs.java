class Solution {
//     recursive approach
        
//         public int recursive(int l,int[] cost)
//     {
//         if(l >= cost.length)
//             return 0;
        
//         //one-step
//         int one = cost[l]+recursive(l+1,cost);
//         //two-step
//         int two = cost[l]+recursive(l+2,cost);
        
//         return Math.min(one,two);
//     }
//     public int minCostClimbingStairs(int[] cost) {
//         return Math.min(recursive(0,cost),recursive(1,cost));
//     }
    
    //recursion + memoization
    int[] dp;
    public int recursive(int l,int[] cost)
    {
        if(l >= cost.length)
            return 0;
        
        if(dp[l]!=-1)
            return dp[l];
        
        //one-step
        int one = cost[l]+recursive(l+1,cost);
        //two-step
        int two = cost[l]+recursive(l+2,cost);
        
        return dp[l] = Math.min(one,two);
    }
    public int minCostClimbingStairs(int[] cost) {
        dp = new int[cost.length+1];
        Arrays.fill(dp,-1);
        return Math.min(recursive(0,cost),recursive(1,cost));
    }
}