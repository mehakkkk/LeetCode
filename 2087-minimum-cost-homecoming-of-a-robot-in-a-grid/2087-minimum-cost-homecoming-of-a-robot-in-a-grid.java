class Solution {
    
    public int[] rowDp,colDp;
    public int traverseRow(int start,int dest,int[] cost)
    {
        if(start == dest || start<0 || start>=cost.length)
            return 0;
        if(rowDp[start] != 0)
            return rowDp[start];
        
        if(start<dest) //move down
        {
            start += 1;
            return rowDp[start] = cost[start] + traverseRow(start,dest,cost);
        } 
        else  //move up
        {
            start -= 1;
            return rowDp[start] = cost[start] + traverseRow(start,dest,cost);
        }
    }
    
    public int traverseCol(int start,int dest,int[] cost)
    {
        if(start == dest || start<0 || start>=cost.length)
            return 0;
        
        if(colDp[start] != 0)
            return colDp[start];
        
        if(start<dest) //move right
        {
            start += 1;
            return colDp[start] = cost[start] + traverseCol(start,dest,cost);
        } 
        else  //move left
        {
            start -= 1;
            return colDp[start] = cost[start] + traverseCol(start,dest,cost);
        }
    }
    public int minCost(int[] startPos, int[] homePos, int[] rowCosts, int[] colCosts) {
        
        rowDp = new int[rowCosts.length];
        colDp = new int[colCosts.length];
        
        
        int startX = startPos[0];
        int startY = startPos[1];
        
        
        int destX = homePos[0];
        int destY = homePos[1];
        
        
        int row = traverseRow(startX,destX,rowCosts);
        int col = traverseCol(startY,destY,colCosts);
        
        return row+col;
        
    }
}