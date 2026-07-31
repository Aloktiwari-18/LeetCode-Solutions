class Solution {
    public int minimumPushes(String word) {
        int freq[]= new int[26];
        for(char ch: word.toCharArray()){
            freq[ch-'a']++;
        }
        int ans=0;int idx=0;
        Arrays.sort(freq);
        for(int i=25;i>=0;i--){
            ans+=freq[i]*(idx/8+1);
            idx++;

        }
        return ans;
    }
}