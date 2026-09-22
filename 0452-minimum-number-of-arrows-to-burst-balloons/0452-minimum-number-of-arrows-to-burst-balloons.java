class Solution {
    public int findMinArrowShots(int[][] p) {
        Arrays.sort(p, (a,b)->{
            return Integer.compare(a[0], b[0]);
        });

        
        int count =1;
        int c=p[0][1];


        for(int i=0;i<p.length;i++){


           
            
            int a=p[i][0];
            int b=p[i][1];

            if(c>=a){
                c=Math.min(c, b);
            }else{
                count++;
                c=b;
            }
            
            
        }
        return count;
    }
}