class Solution {
    
    public void helper(int[][] graph,int vertex,List<Integer>path,List<List<Integer>>list)
    {
        if(vertex == graph.length-1)
        {
            System.out.println(vertex+" "+path.size());
            list.add(new ArrayList<>(path));
            return;
        }
        
        for(int v: graph[vertex])
        {
            path.add(v);
            helper(graph,v,path,list);
            path.remove(path.size()-1);
        }
    }
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        List<List<Integer>>list = new ArrayList<>();
        List<Integer>path = new ArrayList<>();
        path.add(0);
        helper(graph,0,path,list);
        return list;
    }
}