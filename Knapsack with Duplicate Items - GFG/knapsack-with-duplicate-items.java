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
            String line1[] = in.readLine().trim().split("\\s+");
            int N = Integer.parseInt(line1[0]);
            int W = Integer.parseInt(line1[1]);
            String line2[] = in.readLine().trim().split("\\s+");
            int val[] = new int[N];
            for(int i = 0;i < N;i++)
                val[i] = Integer.parseInt(line2[i]);
            String line3[] = in.readLine().trim().split("\\s+");
            int wt[] = new int[N];
            for(int i = 0;i < N;i++)
                wt[i] = Integer.parseInt(line3[i]);
                
            Solution ob = new Solution();
            System.out.println(ob.knapSack(N, W, val, wt));
        }
    }
}// } Driver Code Ends


//User function Template for Java

class Solution{
    static int[][] dp;
    static int maxProfit(int l,int W,int[] val,int[] wt)
    {
        if(l == val.length || W == 0)
        return 0;
        
        if(dp[l][W]!=-1)
        return dp[l][W];
        
        int include = 0;
        if(W-wt[l]>=0)
        {
            include = val[l]+maxProfit(l,W-wt[l],val,wt);
        }
        
        int exclude = maxProfit(l+1,W,val,wt);
        
        return dp[l][W] = Math.max(include,exclude);
    }
    static int knapSack(int N, int W, int val[], int wt[])
    {
        // code here
        dp = new int[N+1][W+1];
        for(int i=0;i<=N;i++)
        {
            for(int j=0;j<=W;j++)
            {
                dp[i][j] = -1;
            }
        }
        return maxProfit(0,W,val,wt);
    }
}