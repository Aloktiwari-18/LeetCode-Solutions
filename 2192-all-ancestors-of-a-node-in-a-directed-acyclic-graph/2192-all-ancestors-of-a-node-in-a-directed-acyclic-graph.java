class Solution {
    public List<List<Integer>> getAncestors(int n, int[][] edges) {
        List<List<Integer>> adj= new ArrayList<>();
        int indegree[]= new int[n+1];
        

        for(int i=0;i<n;i++){
            adj.add(new ArrayList<>());
        }
        
        for(int []e:edges){
                adj.get(e[0]).add(e[1]);
            }
        
        for(int i=0;i<n;i++){
            for(int next:adj.get(i)){
                indegree[next]++;
            }
        }


       HashSet<Integer> [] ancestor= new HashSet[n];
       for(int i=0;i<n;i++){
        ancestor[i]= new HashSet();
       }
       Queue<Integer> q= new LinkedList<>();
       for(int i=0;i<n;i++ ){
        if(indegree[i]==0){
            q.add(i);
        }
       }
       while(!q.isEmpty()){
        int top= q.poll();
        for(int next:adj.get(top)){
            ancestor[next].add(top);
            ancestor[next].addAll(ancestor[top]);

            indegree[next]--;
            if(indegree[next]==0){
                q.add(next);
            }
   

        }

       }
       List<List<Integer>> res= new ArrayList<>();
       for(int i=0;i<n;i++){
        List<Integer> list= new ArrayList<>(ancestor[i]);
        Collections.sort(list);
        res.add(list);
       }
       return res;





    }
}