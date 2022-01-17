// { Driver Code Starts
//Initial Template for Java



import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine().trim());
        while (tc-- > 0) {
            String[] inputLine;
            int n = Integer.parseInt(br.readLine().trim());
            int[] arr = new int[n];
            inputLine = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(inputLine[i]);
            }

            int ans = new Solution().findMaxSum(arr, n);
            System.out.println(ans);
        }
    }
}// } Driver Code Ends


//User function Template for Java

class Solution {
    //using recursion
    // int recursion(int[] arr,int l)
    // {
    //     if(l >= arr.length)
    //     return 0;
        
    //     int include = arr[l] + recursion(arr,l+2);
    //     int exclude = recursion(arr,l+1);
        
    //     return Math.max(include,exclude);
    // }
    
    //using recursion + memoization
    int recursion(int[] arr,int l)
    {
        if(l >= arr.length)
        return 0;
        
        if(dp[l]!=-1)
        return dp[l];
        
        int include = arr[l] + recursion(arr,l+2);
        int exclude = recursion(arr,l+1);
        
        return dp[l] = Math.max(include,exclude);
    }
    
    int[] dp;
    int findMaxSum(int arr[], int n) {
        dp = new int[n];
        Arrays.fill(dp,-1);
        return recursion(arr,0);
        
    }
}