class Solution {
    public int minimumDeletions(String s) {
        int ans=0;
        int bs=0;
        for(char ch:s.toCharArray()){
            if(ch=='b'){
                bs++;
            }else{
                ans=Math.min(ans+1,bs);
            }
        }
        return ans;
        
    }
}