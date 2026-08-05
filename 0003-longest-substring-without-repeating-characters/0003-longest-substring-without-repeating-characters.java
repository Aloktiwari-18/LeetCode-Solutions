class Solution {
    public int lengthOfLongestSubstring(String s) {
        int left=0;
        int right=0;
        int n= s.length();
        int max=0;
        int freq[]=new int[128];
        while(right<n){
           
            while(freq[s.charAt(right)]>0){
                freq[s.charAt(left)]--;
                left++;
                
            }
            freq[s.charAt(right)]++;
            max=Math.max(right-left+1, max);
            right++;

            

        }
        return max;

        
    }
}