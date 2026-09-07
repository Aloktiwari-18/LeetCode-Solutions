class Solution {
    public int characterReplacement(String s, int k) {

        int left=0;
        int right=0;
        int maxFreq=0;
        int maxLen=Integer.MIN_VALUE;
        int hash[]=new int[256];
        while(right<s.length()){
            hash[s.charAt(right)-'A']++;
            maxFreq=Math.max(maxFreq, hash[s.charAt(right)-'A']);

            while((right-left+1)- maxFreq>k){
                hash[s.charAt(left)-'A']--;
                maxFreq=0;
                for(int i=0;i<255;i++){
                    maxFreq= Math.max(maxFreq, hash[i]);
                }
                left++;
            }
            if((right-left+1)-maxFreq<=k){
                maxLen=Math.max(maxLen,right-left+1);
            }
            right++;



        }
        return maxLen;
    }
}