class Solution {
    public int[] sortByBits(int[] A) {
        int n= A.length;
        Integer arr[]= new Integer[n];
        for(int i=0;i<n;i++){
            arr[i]= A[i];
        }
        Arrays.sort(arr, (a,b)->{
            int bitCountA= Integer.bitCount(a);
            int bitCountB= Integer.bitCount(b);

            if(bitCountA!=bitCountB){
                return bitCountA-bitCountB;
            }else{
                return a-b;
            }
        });

        for(int i=0;i<n;i++){
            A[i]=arr[i];
        }
        return A;
        
    }
}