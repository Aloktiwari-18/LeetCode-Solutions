class Solution {
    public int lastStoneWeight(int[] stones) {
    if(stones.length==1){
        return stones[0];
    }
    PriorityQueue<Integer> pq= new PriorityQueue<>(Collections.reverseOrder());
    for(int ele: stones){
        pq.add(ele);

        
    }
    if(stones.length==2){
        return Math.abs(stones[0]-stones[1]);
    }
    while(pq.size()>1){
        

        
          int n1 = pq.poll();
            int n2 = pq.poll();

            if(n1 != n2) {
                pq.add(n1 - n2);
            }
    
    }
    return pq.size()==0 ?0: pq.peek();

        
    }
}