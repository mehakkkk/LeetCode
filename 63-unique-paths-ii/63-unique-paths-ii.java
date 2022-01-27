class Solution {
    public int[][] dp;
    public int solve(int m,int n,int[][] grid)
    {
        if(m == grid.length-1 && n ==grid[0].length-1)
            return 1;
        if(m>=grid.length ||n>= grid[0].length || grid[m][n] == 1)
            return 0;
        
        if(dp[m][n]!=-1)
            return dp[m][n];
        
        int right = solve(m,n+1,grid);
        int down = solve(m+1,n,grid);
        
        return dp[m][n] = right+down;
    }
    public int uniquePathsWithObstacles(int[][] grid) {
        
        if(grid[0][0] == 1 || grid[grid.length-1][grid[0].length-1] == 1)
            return 0;
        
        dp= new int[grid.length][grid[0].length];
        for(int i=0;i<grid.length;i++)
        {
            for(int j =0;j<grid[0].length;j++)
            {
                if(grid[i][j] == 1)
                    dp[i][j] =0;
                else
                    dp[i][j] =-1;
            }
        }
        
        
        return solve(0,0,grid);
        //using bottom -up dp
//         int r = grid.length;
//         int c = grid[0].length;
//         int[][] dp = new int[r+1][c+1];
        
//         dp[0][0] = 1;
        
//         for(int i =1;i<=r;i++)
//         {
//             dp[i][0] = grid[i-1][0]== 0?1:0;
//         }
        
//         // for(int i =1;i<=c;i++)
//         // {
//         //     dp[0][i] = grid[0][i-1] == 0?1:0;
//         // }
//         dp[0][0] = 1;
        
//         for(int i =1;i<=r;i++)
//         {
//             for(int j =1;j<=c;j++)
//             {
//                 if(i == 1 && grid[i-1][j-1] == 0)
//                     dp[i][j] = 1;
//                 else if(j == 1 && grid[i-1][j-1] == 0)
//                     dp[i][j] = 1;
//                 else if(grid[i-1][j-1] == 0)
//                 {
//                     dp[i][j] = dp[i-1][j] + dp[i][j-1];
//                 }
//                 else
//                 {
//                     dp[i][j] = 0;
//                 }
//             }
//         }
//         return dp[r][c];
    }
}