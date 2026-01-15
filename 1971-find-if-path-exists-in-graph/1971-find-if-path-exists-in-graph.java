class Solution {
    public boolean dfs(int src,List<List<Integer>> adj,boolean [] vis, int dest ){
        if(src==dest) return true;
        vis[src]=true;
        for(int node: adj.get(src)){
            if(!vis[node]){
               if(dfs(node, adj, vis, dest))
               return true;
            }
        }
        return false;
        

    }
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        
        boolean[] vis= new boolean[n];
        List<List<Integer>> adj= new ArrayList<>();
        for(int i=0;i<n;i++){
            adj.add(new ArrayList<>());
        }

        for(int[] e:edges){
            adj.get(e[0]).add(e[1]);
            adj.get(e[1]).add(e[0]);

        }

        return dfs(source,adj,vis,destination);

        
    }
}