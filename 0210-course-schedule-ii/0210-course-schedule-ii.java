class Solution {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        ArrayList<ArrayList<Integer>> adj= new ArrayList<>();
        for(int i=0;i<numCourses;i++){
            adj.add(new ArrayList<>());
        }

        for(int i=0;i<prerequisites.length;i++){
            int a= prerequisites[i][0];
            int b= prerequisites[i][1];

            adj.get(b).add(a);
        }
        int indegree[]= new int[numCourses];
        for(int i=0;i<numCourses;i++){
            for(int it:adj.get(i)){
                indegree[it]++;
            }
        }
        ArrayList<Integer> ans= new ArrayList<>();
        Queue<Integer> q= new LinkedList<>();
        for(int i=0;i<numCourses;i++){
            if(indegree[i]==0){
                ans.add(i);
                q.add(i);
                
            }
        }
        while(!q.isEmpty()){
            int node= q.poll();
            for(int it: adj.get(node)){
                indegree[it]--;
                if(indegree[it]==0){
                    ans.add(it);
                    q.add(it);
                }
            }

        }
        if(ans.size() != numCourses){
            return new int[0];
        }
        int result[]= new int[numCourses];
        for(int i=0;i<result.length;i++){
            result[i]= ans.get(i);
        }
        return result;


        
    }
}