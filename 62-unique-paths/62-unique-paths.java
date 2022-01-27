class Solution {
    // int[][] dp;
    
    //recursion + memoization
    public int helper(int m,int n,int[][] dp)
    {
        if(m<=0 || n<=0)
            return 0;
        if(m == 1 && n == 1)
            return 1;
        
        if(dp[m][n] != -1)
            return dp[m][n];
        
        int left = uniquePaths(m,n-1);
        int up = uniquePaths(m-1,n);
        
        return dp[m][n] = left+up;
    }
    public int uniquePaths(int m, int n) {
        
        int[][] dp = new int[m+1][n+1];
        
        // for(int i=0;i<=m;i++)
        // {
        //     for(int j =0;j<=n;j++)
        //     {
        //         dp[i][j] = -1;
        //     }
        // }
        
        //return helper(m,n,dp);
        
        //using bottom-up dp
        for(int i =1;i<=m;i++)
        {
            for(int j = 1;j<=n;j++)
            {
                if(i == 1 )
                {
                    dp[i][j] = 1;
                }
                else if(j == 1)
                {
                    dp[i][j] = 1;
                }
                else
                {
                    dp[i][j] = dp[i][j-1] + dp[i-1][j];
                }
            }
        }
        
        return dp[m][n];
    }
}