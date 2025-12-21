class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {

        //Graph creation
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for(int i = 0; i < numCourses; i++){
            adj.add(new ArrayList<>());
        }

        //Edge direction: b -> a
        for(int i = 0; i < prerequisites.length; i++){
            int a = prerequisites[i][0];
            int b = prerequisites[i][1];
            adj.get(b).add(a);
        }

        // Indegree array
        int indegree[] = new int[numCourses];
        for(int i = 0; i < numCourses; i++){
            for(int it : adj.get(i)){
                indegree[it]++;
            }
        }

        // Queue for BFS
        Queue<Integer> q = new LinkedList<>();
        for(int i = 0; i < numCourses; i++){
            if(indegree[i] == 0){
                q.add(i);
            }
        }

        //Topological sort
        int count = 0;
        while(!q.isEmpty()){
            int node = q.poll();
            count++;

            for(int it : adj.get(node)){
                indegree[it]--;
                if(indegree[it] == 0){
                    q.add(it);
                }
            }
        }

        //  Check cycle
        return count == numCourses;
    }
}
