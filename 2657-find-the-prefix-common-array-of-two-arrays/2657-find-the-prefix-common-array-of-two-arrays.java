class Solution {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
         int n= A.length;
        int arr1[]= new int[n+1];
        int arr2[]= new int[n+1];
       
        int ans[]= new int[A.length];
        for(int i=0;i<n;i++){
            int num1=A[i];
            int num2=B[i];

            arr1[num1]++;
            arr2[num2]++;
            

            int count=0;
            for(int j=1;j<=n;j++){
                
                if(arr1[j]!=0 && arr2[j]!=0){
                    count++;
                }
            }
            ans[i]=count;
            

        }
        return ans;


    }
}