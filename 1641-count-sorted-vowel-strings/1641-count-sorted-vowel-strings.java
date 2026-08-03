class Solution {
    int count;
    public int helper(int len, int start){
       if(len==0){
        return 1;
       }
       int ans=0;
       for( int i=start;i<5;i++){
        ans+=helper(len-1, i);
       }
       return ans;
        
    }
    public int countVowelStrings(int n) {
       
        return helper(n, 0);
        
    }
}