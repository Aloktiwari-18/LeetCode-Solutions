class Solution {
    public int maxConsecutiveAnswers(String ansKey, int k) {
        int n= ansKey.length();
        int left=0;
        int right=0;
        int ans=0;
        int max=0;
        int freq[]= new int[26];

        while(right<n){
            freq[ansKey.charAt(right)-'A']++;
             max= Math.max(freq[ansKey.charAt(right)-'A'],max);

             if(right-left+1-max > k){
                freq[ansKey.charAt(left)-'A']--;
                max=0;
                for(int i=0;i<25;i++){
                    max=Math.max(max, freq[i]);
                }
                left++;
             }
             if(right-left+1-max<=k){
                ans= Math.max(ans, right-left+1);
             }
             right++;
        }
            return ans;



    }
}