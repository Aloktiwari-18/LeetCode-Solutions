class Solution {
    public void duplicateZeros(int[] arr) {
        int res[]= new int[arr.length];
        int j=0;
        for(int i=0;i<arr.length && j<arr.length;i++){
            if(arr[i]==0){
                res[j]=0;
                j++;
                if(j<arr.length){
                    res[j]=0;
                    j++;
                }

            }else{
                res[j]=arr[i];
                j++;


            }

        }
        for(int i=0;i<arr.length;i++){
            arr[i]=res[i];
        }
    }
}