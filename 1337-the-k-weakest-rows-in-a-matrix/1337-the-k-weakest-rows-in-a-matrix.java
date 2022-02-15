//using binary search + array sorting
class Node
{
    int oneCount;
    int index;
    public Node(int oneCount,int index)
    {
        this.index = index;
        this.oneCount = oneCount;
    }
}
class Solution {
    public int binSearch(int[] arr,int l,int h)
    {
        while(l<=h)
        {
            int mid = (l+h)/2;
            
            if(arr[mid] == 0)
            {
                h = mid-1;
            }
            else
                l = mid+1;
        }
        return l;
    }
    public int[] kWeakestRows(int[][] mat, int k) {
        
        Node[] count = new Node[mat.length];
        
        for(int i =0;i<mat.length;i++)
        {
            count[i] = new Node(binSearch(mat[i],0,mat[i].length-1),i);
        }
        
        Arrays.sort(count,(a,b)-> a.oneCount - b.oneCount);
        
        int[] ans = new int[k];
        for(int i=0;i<k;i++)
        {
            ans[i] = count[i].index;
            //System.out.println(weak.index+" "+weak.oneCount);
        }
        return ans;
        
    }
}