class Pair{
    int distance;
    int x1;
    int x2;
    Pair(int _distance, int _x1, int _x2){
        this.distance=_distance;
        this.x1=_x1;
        this.x2=_x2;
    }
}

class Solution {
    public int[][] kClosest(int[][] points, int k) {
       
    int n=points.length;
        
        PriorityQueue<Pair> pq= new PriorityQueue<>((a,b)->a.distance-b.distance);
        for(int i=0;i<n;i++){
            int x=points[i][0];
            int y= points[i][1];

            int dist = x * x + y * y;
            pq.add(new Pair(dist,x,y));

        }
        int ans[][]= new int[k][2];

        for(int i=0;i<k;i++){
            
            Pair p=pq.poll();
            ans[i][0]=p.x1;
            ans[i][1]=p.x2;


        }
        return ans;
        
        
    }
}