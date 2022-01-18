// { Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {
            int N = Integer.parseInt(read.readLine());
            String input_line[] = read.readLine().trim().split("\\s+");
            int A[]= new int[N];
            for(int i = 0; i < N; i++)
                A[i] = Integer.parseInt(input_line[i]);
            
            Solution ob = new Solution();
            System.out.println(ob.longestSubsequence(N, A));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution{
    static int solve(int[] A,int prev,int curr)
    {
        if(curr == A.length)
        return 0;
        
        int include =0;
        if(prev == -1 || A[prev]+1 == A[curr] || A[prev]-1 == A[curr])
        {
            include =  1+ solve(A,curr,curr+1);
        }
        
        int exclude = solve(A,prev,curr+1);
        
        return Math.max(include,exclude);
        
        
    }
    static int longestSubsequence(int N, int A[])
    {
        // code here
        return solve(A,-1,0);
    }
}