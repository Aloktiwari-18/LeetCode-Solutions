class Solution {
    public int kthSmallest(int[][] matrix, int k) {
        ArrayList<Integer> arr= new ArrayList<>();
        PriorityQueue<Integer> pq= new PriorityQueue<>(Collections.reverseOrder());
        for(int [] row:matrix){
            for(int val:row){
                arr.add(val);


            }
        }
        int ans=0;
        for(int i=0;i<k;i++){
            pq.add(arr.get(i));
            if(pq.size()>k){
                pq.poll();

            }

        }
        return pq.peek();
        
    }
}