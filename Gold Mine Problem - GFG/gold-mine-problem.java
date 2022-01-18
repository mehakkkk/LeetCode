// { Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG{
    public static void main(String args[])throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(in.readLine());
        while(t-- > 0){
            String inline[] = in.readLine().trim().split("\\s+");
            int n = Integer.parseInt(inline[0]);
            int m = Integer.parseInt(inline[1]);
            String inline1[] = in.readLine().trim().split("\\s+");
            int M[][] = new int[n][m];
            for(int i = 0;i < n*m;i++){
                M[i/m][i%m] = Integer.parseInt(inline1[i]);
            }
            
            Solution ob = new Solution();
            System.out.println(ob.maxGold(n, m, M));
        }
    }
} // } Driver Code Ends


//User function Template for Java

class Solution{
    
    //using recursion
    
    // static int solve(int[][]M,int row,int col,int n,int m)
    // {
    //     if(row<0 || col<0 || row>=n || col>=m)
    //     return 0;
        
    //     int diagUp  = M[row][col] + solve(M,row-1,col+1,n,m);
    //     int right   = M[row][col] + solve(M,row,col+1,n,m);
    //     int diagDown= M[row][col] + solve(M,row+1,col+1,n,m);
        
    //     return Math.max(diagUp,Math.max(diagDown,right));
    // }
    
    
    //using recursion + memoization
    
    static int[][] dp;
    
    static int solve(int[][]M,int row,int col,int n,int m)
    {
        if(row<0 || col<0 || row>=n || col>=m)
        return 0;
        
        if(dp[row][col]!=-1)
        return dp[row][col];
        
        int diagUp  = M[row][col] + solve(M,row-1,col+1,n,m);
        int right   = M[row][col] + solve(M,row,col+1,n,m);
        int diagDown= M[row][col] + solve(M,row+1,col+1,n,m);
        
        return dp[row][col] = Math.max(diagUp,Math.max(diagDown,right));
    }
    static int maxGold(int n, int m, int M[][])
    {
        // code here
        int max = Integer.MIN_VALUE;
        dp = new int[n][m];
        
        for(int[] row:dp)
            Arrays.fill(row,-1);
        
        //loop to start from any row in the first col
        for(int i=0;i<n;i++)
        {
            max = Math.max(max,solve(M,i,0,n,m));
        }
        return max;
    }
}