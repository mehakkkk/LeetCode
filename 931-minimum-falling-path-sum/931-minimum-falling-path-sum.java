class Solution {
    static int[][] dp;
    public int solve(int[][] matrix,int row,int col)
    {
        if(row<0 || col<0 || row>=matrix.length || col>=matrix.length)
            return Integer.MAX_VALUE-101;
        if(row == matrix.length-1)
            return matrix[row][col];
        
        if(dp[row][col] != Integer.MAX_VALUE)
        {
            return dp[row][col];
        }
        
        
        int leftDiag = matrix[row][col] + solve(matrix,row+1,col-1);
        int rightDiag = matrix[row][col] + solve(matrix,row+1,col+1);
        int down = matrix[row][col] + solve(matrix,row+1,col);
        return dp[row][col] = Math.min(down,Math.min(leftDiag,rightDiag));
    }
    public int minFallingPathSum(int[][] matrix) {
        
        int min = Integer.MAX_VALUE;
        dp = new int[matrix.length][matrix.length];
        
        for(int[] row:dp)
        {
            Arrays.fill(row,Integer.MAX_VALUE);
        }
        for(int i =0;i<matrix.length;i++)
        {
            min = Math.min(min,solve(matrix,0,i));
        }
        
        return min;
        
    }
}