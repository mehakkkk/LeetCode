//{ Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0)
        {
            
            int N=sc.nextInt();
            int K=sc.nextInt();
            ArrayList<Integer> Arr = new ArrayList<Integer>(N); 
  
            // Appending new elements at 
            // the end of the list 
            for (int i = 0; i < N; i++) {
                int x = sc.nextInt();
                Arr.add(x); 
            }

            Solution ob = new Solution();
            System.out.println(ob.maximumSumSubarray(K,Arr,N));
        }
    }
}

// } Driver Code Ends


//User function Template for Java
class Solution{
    static long maximumSumSubarray(int k, ArrayList<Integer> Arr,int N){
        // code here
        
        long sum = 0;
        long max = 0;
        
        int i = 0;
        int j = 0;
        
        while(i<=N-k)
        {
            
            if((j-i)+1 == k+1)
            {
                
                //System.out.println("window size reached:"+sum+" i:"+i+" j:"+j);
                max = Math.max(max,sum);
                sum -= Arr.get(i);
                i++;
            }
            else if((j-i)+1<k+1)
            {
                sum += Arr.get(j);
                j++;
            }
        }
        
        return max;
        
    }
}