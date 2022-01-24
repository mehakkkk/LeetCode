// { Driver Code Starts
//Initial Template for Java

/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;
class Main {
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int T=sc.nextInt();
		sc.nextLine();
		while(T-->0)
		{
		    
		    Solution ob=new Solution();
		    
		    String S=sc.nextLine();
		    
		    ArrayList<String> arr = ob.permutation(S);
		    for(String s : arr){
		        System.out.print(s+" ");
		    }
		    System.out.println();
		}
		
	}
}
// } Driver Code Ends


//User function Template for Java


class Solution
{
    public void permutation(String s,int l,ArrayList<String>list)
    {
        if(l == s.length())
        {
            list.add(s);
            return;
            
        }
        
        for(int i=l;i<s.length();i++)
        {
            char[] temp = s.toCharArray();
            char t = temp[i];
            temp[i] = temp[l];
            temp[l] = t;
            s = new String(temp);
            
            permutation(s,l+1,list);
            
            t = temp[i];
            temp[i] = temp[l];
            temp[l] = t;
            s = new String(temp);
            
        }
    }
    public ArrayList<String> permutation(String S)
    {
        //Your code here
        ArrayList<String>list = new ArrayList<>();
        
        permutation(S,0,list);
        Collections.sort(list);
        return list;
        
    }
	   
}
