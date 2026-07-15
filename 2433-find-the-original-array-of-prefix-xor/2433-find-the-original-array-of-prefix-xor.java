class Solution {
    public int[] findArray(int[] arr) {
        int pref[]= new int[arr.length];
        pref[0]=arr[0];
        
        for(int i=1;i<arr.length;i++){
            pref[i]= arr[i]^arr[i-1];
            
            
        }
        return pref;
        
        
    }
}