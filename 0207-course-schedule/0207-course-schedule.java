class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {

        List<List<Integer>> adj= new ArrayList<>();
        for(int i=0;i<numCourses;i++){
            adj.add(new ArrayList<>());

        }

        for(int i=0;i<prerequisites.length;i++){
            int a=prerequisites[i][0];
            int b=prerequisites[i][1];

            adj.get(b).add(a);

        }
        Queue<Integer> q= new LinkedList<>();
        int indegree []= new int[numCourses];
        for(int i=0;i<numCourses;i++){
            for(int next:adj.get(i)){
                indegree[next]++;
            }
        }
        for(int i=0;i<numCourses;i++){
            if(indegree[i]==0){
                q.add(i);
            }
        }
        int count=0;
        while(!q.isEmpty()){
            int top= q.poll();
            count++;
            for(int node:adj.get(top)){
                indegree[node]--;
                if(indegree[node]==0){
                    q.add(node);
                }
            }
        }
        return numCourses==count;


        




        
    }
}