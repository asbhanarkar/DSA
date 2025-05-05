class Solution {
    public void dfs(int graph[][], List<List<Integer>> res, List<Integer> path, int u){
        
        if(u == graph.length - 1 ){
            res.add(new ArrayList<>(path));
            return;
        }
        
        for(int next: graph[u]){
            path.add(next);
            dfs(graph, res, path, next);
            path.remove(path.size() -1);
        }
        
        return;
    }
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        List<List<Integer>> list = new ArrayList<>();
        List<Integer> path = new ArrayList<>();
        path.add(0);
        dfs(graph, list, path, 0);
        return list;
    }
}