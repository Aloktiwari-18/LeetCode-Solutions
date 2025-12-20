class Solution {
    private boolean dfscheck(int node, int [][] graph,int vis[], int path[], int check[]){
        vis[node]= 1;
        path[node]= 1;
        for(int it: graph[node]){
            if(vis[it]==0){
               if (dfscheck(it,graph,vis, path, check)==true) 
               return true;
            }
            else if(path[it]==1){
                return true;
            }
        }
        check[node]=1;
        path[node]=0;
        return false;
    }
    public List<Integer> eventualSafeNodes(int[][] graph) {
        int V= graph.length;
        int vis[]= new int [V];
        int path[]= new int [V];
        int check[]= new int [V];

        for(int i=0;i<V;i++){
            if(vis[i]==0){
                dfscheck(i, graph,vis, path, check);
            }
        }
        List<Integer> safeNodes= new ArrayList<>();
        for(int i=0;i<V;i++){
            if(check[i]==1) safeNodes.add(i);
        }
        return safeNodes;
        
    }
}