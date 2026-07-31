class Solution {
    public int[] findDegrees(int[][] mat) {

        int ans[]= new int[mat.length];
        int n= mat.length;
        
        for(int j=0;j<mat.length;j++){
            int count=0;
            
            for(int i=0;i<n;i++){
               if(mat[i][j]==1){
                count++;
               }

            }
            ans[j]=count;


        }
        return ans;
    }
}