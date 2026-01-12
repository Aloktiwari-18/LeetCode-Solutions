class Solution {

    public int maximumDetonation(int[][] bombs) {
        int n = bombs.length;
        List<List<Integer>> graph = new ArrayList<>();

        for(int i = 0; i < n; i++) graph.add(new ArrayList<>());

        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                if(i == j) continue;

                long dx = bombs[i][0] - bombs[j][0];
                long dy = bombs[i][1] - bombs[j][1];
                long r = bombs[i][2];

                if(dx * dx + dy * dy <= r * r){
                    graph.get(i).add(j);
                }
            }
        }

        int ans = 0;

        for(int i = 0; i < n; i++){
            boolean[] vis = new boolean[n];
            ans = Math.max(ans, dfs(i, graph, vis));
        }

        return ans;
    }

    private int dfs(int node, List<List<Integer>> graph, boolean[] vis){
        vis[node] = true;
        int count = 1;

        for(int next : graph.get(node)){
            if(!vis[next]){
                count += dfs(next, graph, vis);
            }
        }
        return count;
    }
}
