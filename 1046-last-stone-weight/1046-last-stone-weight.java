class Solution {
    public int lastStoneWeight(int[] stones) {
         PriorityQueue<Integer> pq
            = new PriorityQueue<Integer>(
                Collections.reverseOrder());
        
        for(int i:stones)
        {
            pq.add(i);
        }
        
        
        while(pq.size()>1)
        {
            int x = pq.remove();
            int y = pq.remove();
            
            if(x == y)
                continue;
            else
                pq.add(x-y);
        }
        if(pq.size()>0)
        return pq.remove();
        
        return 0;
        
    }
}