class Solution {
    public int findLongestChain(int[][] pair) {
        Arrays.sort(pair, (a,b)->{
            
               return Integer.compare(a[1], b[1]);
            
               
            
        });
        int count=0;
       int prev=Integer.MIN_VALUE;
       for(int i=0;i<pair.length;i++){
        int st= pair[i][0];
        int end= pair[i][1];
        if(st>prev){
            count++;
            prev=end;
        }
       }
       return count;


        
    }
}