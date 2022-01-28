class Solution {
    static int[][] dp;
    public int minFallingPathSum(int[][] matrix) {
        
        int min = Integer.MAX_VALUE;
        dp = new int[matrix.length+1][matrix.length+2];
        
        for(int[] row:dp)
        {
            Arrays.fill(row,Integer.MAX_VALUE-101);
        }
        
        for(int i=1;i<=matrix.length;i++)
        {
            for(int j =1;j<=matrix.length;j++)
            {
                if(i == 1 )
                {
                    dp[i][j] = matrix[i-1][j-1];
                }
                else
                {
                    int up = matrix[i-1][j-1] + dp[i-1][j];
                    int diagRight = matrix[i-1][j-1] + dp[i-1][j+1];
                    int diagLeft = matrix[i-1][j-1] + dp[i-1][j-1];
                    dp[i][j] = Math.min(up,Math.min(diagRight,diagLeft));
                }
                    
            }
        }
        
        //all min values will be stored in last row
        for(int i =0;i<matrix.length;i++)
        {
            min = Math.min(min,dp[matrix.length][i+1]);   
        }
        return min;
    }
}