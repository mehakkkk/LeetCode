//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while(T-->0)
        {
            String s = br.readLine().trim();
            Solution ob = new Solution();
            List<String> ans = ob.AllPossibleStrings(s);
            for(String i: ans)
                System.out.print(i + " ");
            System.out.println();
            
        }
    }
}

// } Driver Code Ends


//User function Template for Java

class Solution
{
    public void AllPossibleStrings(String s,String curr, List<String>result,int in)
    {
        if(in == s.length())
        {
            if(curr != "")
            result.add(curr);
            return;
        }
        AllPossibleStrings(s,curr+s.charAt(in),result,in+1);
        AllPossibleStrings(s,curr,result,in+1);
        
    }
    public List<String> AllPossibleStrings(String s)
    {
        List<String>result = new ArrayList<>();
        AllPossibleStrings(s,"",result,0);
        Collections.sort(result);
        return result;
    }
}