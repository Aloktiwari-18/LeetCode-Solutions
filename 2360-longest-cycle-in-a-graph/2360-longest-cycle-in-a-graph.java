class Solution {
    public int longestCycle(int[] edges) {
        int n= edges.length;
        boolean [] vis= new boolean[n];
        int ans=-1;
        
        for(int i=0;i<n;i++){
            if(!vis[i]){

            
            int curr=i;
            Map<Integer, Integer> map= new HashMap<>();
            int step=0;

            while(curr!=-1 && !vis[curr]){
                vis[curr]=true;
                
                map.put(curr,step++);
                curr=edges[curr];

                if(curr!=-1 && map.containsKey(curr)){
                    ans=Math.max(ans,step-map.get(curr));
                    break;
                }
            }

        }
  }
        return ans;

    }
}