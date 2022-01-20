class Solution {
    int[] dp;
    int solve(int n)
    {
        if(n<=1)
            return n;
        
        if(dp[n] !=-1)
            return dp[n];
        
        return dp[n] = solve(n-1) + solve(n-2) + solve(n-3);
    }
    public int tribonacci(int n) {
        
        if(n<=1)
            return n;
        if(n ==2)
            return 1;
        
        dp = new int[n+1];
        Arrays.fill(dp,-1);
        dp[0] = dp[1] = dp[2] =1;
        
        return solve(n);
    }
}