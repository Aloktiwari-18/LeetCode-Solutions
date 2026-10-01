class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map= new HashMap<>();
        for(int ele: nums){
            map.put(ele, map.getOrDefault(ele, 0)+1);
        }
        PriorityQueue<Integer> pq=new PriorityQueue<>(
            (n1,n2)->
                 map.get(n1)-map.get(n2)
            
        );
        for(int n: map.keySet()){
            pq.add(n);
            if(pq.size()>k){
                pq.poll();
            }
        }
        int ans[]= new int[k];
        for(int i=ans.length-1;i>=0;i--){
            ans[i]=pq.poll();
        }
        return ans;
        
    }
}