// { Driver Code Starts
import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {
            int N = Integer.parseInt(read.readLine());
            String input_line[] = read.readLine().trim().split("\\s+");
            int arr[]= new int[N];
            for(int i = 0; i < N; i++)
                arr[i] = Integer.parseInt(input_line[i]);
            int sum = Integer.parseInt(read.readLine());

            Solution ob = new Solution();
            if(ob.isSubsetSum(N, arr, sum))
            System.out.println(1);
            else
            System.out.println(0);

            
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution{
    static boolean[][] dp;
    
    //recursion approach
    // static Boolean helper(int[] arr,int l,int sum)
    // {
    //     if(l == arr.length)
    //         return false;
            
    //     if(sum == 0)
    //     return true;
        
    //     //include
    //     boolean include = false;
    //     if(sum - arr[l]>=0)
    //     {
    //         include = helper(arr,l+1,sum-arr[l]);
    //     }
        
    //     //exclude
    //     boolean exclude = helper(arr,l+1,sum);
        
    //     return include || exclude;
    // }
    
    static Boolean isSubsetSum(int N, int arr[], int sum){
        // code here
        dp = new boolean[N+1][sum+1];
        
        for(int i=0;i<sum+1;i++){
            dp[0][i]=false;
        }
        for(int i=0;i<N+1;i++){
            dp[i][0]=true;
        }
        
        for(int i=1;i<=N;i++)
        {
            for(int j=1;j<=sum;j++)
            {
                if(arr[i-1] <= j)  //if value is less than sum include
                {
                    dp[i][j] = dp[i-1][j] || dp[i-1][j-arr[i-1]];
                }
                else //dont include 
                {
                    dp[i][j] = dp[i-1][j];
                    
                }
            }
        }
        
        return dp[N][sum];
    }
}