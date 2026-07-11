class Solution {
    public int countDays(int days, int[][] meet) {
        int n= meet.length;
        Arrays.sort(meet, (a,b)-> Integer.compare(a[0], b[0]));
        int count=0;
            int st= meet[0][0];  
            int end= meet[0][1];  
         for(int i=1;i<n;i++){
            
            int next1= meet[i][0];
            int next2= meet[i][1];


            if(end>=next1){
                end= Math.max(end, next2);

            }else{
                count+=end-st+1;
                st= meet[i][0];
                end=meet[i][1];
            }



        }
         count+=end-st+1;
        
        System.out.print(count);

        return days-count;
        
        
    }
}