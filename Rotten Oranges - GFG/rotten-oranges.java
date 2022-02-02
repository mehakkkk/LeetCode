// { Driver Code Starts
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
            String[] s = br.readLine().trim().split(" ");
            int n = Integer.parseInt(s[0]);
            int m = Integer.parseInt(s[1]);
            int[][] grid = new int[n][m];
            for(int i = 0; i < n; i++){
                String[] S = br.readLine().trim().split(" ");
                for(int j = 0; j < m; j++){
                    grid[i][j] = Integer.parseInt(S[j]);
                }
            }
            Solution obj = new Solution();
            int ans = obj.orangesRotting(grid);
            System.out.println(ans);
        }
    }
}// } Driver Code Ends


class Pair
{
    int row;
    int col;
    public Pair(int row,int col)
    {
        this.row = row;
        this.col = col;
    }
}
class Solution
{
    //Function to find minimum time required to rot all oranges. 
    public int orangesRotting(int[][] grid)
    {
        // Code here
        Queue<Pair>q = new LinkedList<>();
        
        for(int i=0;i<grid.length;i++)
        {
            for(int j = 0;j<grid[i].length;j++)
            {
                if(grid[i][j] == 2)
                {
                    q.add(new Pair(i,j));
                }
            }
        }
        
        int count = -1;
        while(!q.isEmpty())
        {
            int size = q.size();
            while(size>0)
            {
                Pair p = q.remove();
                int row = p.row;
                int col = p.col;
                
                //up
                if(row-1>=0 && grid[row-1][col] == 1)
                {
                    grid[row-1][col] = 2;
                    q.add(new Pair(row-1,col));
                }
                //down
                if(row+1<grid.length && grid[row+1][col] == 1)
                {
                    grid[row+1][col] = 2;
                    q.add(new Pair(row+1,col));
                }
                //left
                if(col-1>=0 && grid[row][col-1] == 1)
                {
                    grid[row][col-1] = 2;
                    q.add(new Pair(row,col-1));
                }
                //right
                if(col+1<grid[0].length && grid[row][col+1] == 1)
                {
                    grid[row][col+1] = 2;
                    q.add(new Pair(row,col+1));
                }
                size--;
            }
            count++;
            
        }
        
        //if any oranges are left
        for(int i=0;i<grid.length;i++)
        {
            for(int j=0;j<grid[0].length;j++)
            if(grid[i][j]==1)
            return -1;
        }
        return count;
    }
}