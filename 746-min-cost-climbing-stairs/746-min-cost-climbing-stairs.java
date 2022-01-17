class Solution {
    //     Solution 1: using recursion
    //        public int recursive(int l,int[] cost)
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

    //      Solution 2: using recursion + memoization
    //     int[] dp;
    //     public int recursive(int l,int[] cost)
    //     {
    //         if(l >= cost.length)
    //             return 0;

    //         if(dp[l]!=-1)
    //             return dp[l];

    //         //one-step
    //         int one = cost[l]+recursive(l+1,cost);
    //         //two-step
    //         int two = cost[l]+recursive(l+2,cost);

    //         return dp[l] = Math.min(one,two);
    //     }
    //     public int minCostClimbingStairs(int[] cost) {
    //         dp = new int[cost.length+1];
    //         Arrays.fill(dp,-1);
    //         return Math.min(recursive(0,cost),recursive(1,cost));
    //     }
    
    //      Solution 3: using bottom up approach
    public int minCostClimbingStairs(int[] cost) {
        int[] dp = new int[cost.length];
        dp[0] = cost[0];
        dp[1] = cost[1];
        
        for(int i=2;i<cost.length;i++)
        {
            int one = cost[i]+dp[i-1];
            int two = cost[i]+dp[i-2];
            
            dp[i] = Math.min(one,two);
        }
        return Math.min(dp[cost.length-1],dp[cost.length-2]);
    }
}
