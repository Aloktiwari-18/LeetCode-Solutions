class Solution {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        ArrayList<ArrayList<Integer>> adj= new ArrayList<>();
        for(int i=0;i<numCourses;i++){
            adj.add(new ArrayList<>());
        }
        for(int [] pre: prerequisites){
            int a= pre[0];
            int b=pre[1];
            adj.get(b).add(a);
        }
        int indeg[]= new int[numCourses];
        for(int i=0;i<numCourses;i++){
            for(int it: adj.get(i)){
                indeg[it]++;
            }
        }
        Queue<Integer> q= new LinkedList<>();
        int count=0;
       ArrayList<Integer> ans=  new ArrayList<>();
        for(int i=0;i<indeg.length;i++){
            if(indeg[i]==0){
               ans.add(i);
                q.add(i);
            }
        }

        while(!q.isEmpty()){
            int node= q.poll();
            count++;
            
            for(int it: adj.get(node)){
                indeg[it]--;
                if(indeg[it]==0){
                    ans.add(it);
                    q.add(it);
                }
                
            }
        }
        if(ans.size() != numCourses){
            return new int[0];
        }
       int[] arr = new int[ans.size()];
        for (int i = 0; i < ans.size(); i++) {
            arr[i] = ans.get(i);
        } 
        return arr;  
        
    }
}