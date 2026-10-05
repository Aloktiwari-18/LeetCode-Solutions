class Solution {
    public boolean solve(int idx, int V, int [][] graph, int[] color){
        Queue<Integer> q= new LinkedList<>();
        q.add(idx);
        color[idx]=0;
        while(!q.isEmpty()){
            int n=q.poll();
            for(int it: graph[n]){
                if(color[it]==-1){
                    color[it]=1-color[n];
                    q.add(it);
                }else if(color[it]==color[n]){
                    return false;
                }
            }
        }
        return true;

    }
    public boolean isBipartite(int[][] graph) {
        int V= graph.length;
        int color[]= new int[graph.length];
        for(int i=0;i<color.length;i++){
            color[i]=-1;

        }
        for(int i=0;i<V;i++){
            if(color[i]==-1){
                if(solve(i, V, graph, color)==false){
                    return false;
                }
            }
        
        }
        return true;

        
    }
}