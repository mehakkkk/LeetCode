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
            int N = Integer.parseInt(in.readLine());
            
            Solution ob = new Solution();
            System.out.println(ob.sequence(N));
        }
    }
}// } Driver Code Ends


//User function Template for Java

class Solution{
    static long ans(int x,int curr,int N)
    {
        if(curr>N) return 0;
        
        long temp=1;
        for(int i=1;i<=curr;i++)
        {
            temp=temp*x;
            x++;
        }
        
        return ans(x,curr+1,N) + temp;
        
    }
    
    static long sequence(int N){
        // code here
        return ans(1,1,N);
    }
}