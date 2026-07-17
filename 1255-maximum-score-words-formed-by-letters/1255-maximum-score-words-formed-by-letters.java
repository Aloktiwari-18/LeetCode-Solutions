class Solution {
    int res=0;
    public  void solver(String [] words, int [] freq, boolean used[] ,int score[], int curr){
        res=Math.max(res, curr);
        for(int i=0;i<words.length;i++){
            if(used[i]) continue;
            int scr=0;
        int arr[]= new int[freq.length];
        for(int j=0;j<26;j++){
            arr[j]= freq[j];
        }
        boolean flag=true;
        
        for(char ch: words[i].toCharArray()){
            if(arr[ch-'a']==0){
                flag= false;
            }
            arr[ch-'a']--;

            scr+=score[ch-'a'];

        }
        if(flag){
            used[i]= true;
            solver(words, arr, used, score, curr+scr);
            used[i]= false;
        }
        }
    }
    public int maxScoreWords(String[] words, char[] letters, int[] score) {
        int freq[]= new int[26];
        int n= words.length;
        for(int i=0;i<letters.length;i++){
            char ch= letters[i];
            freq[ch-'a']++;

        }
        boolean used[]= new boolean[n];
        solver(words, freq, used,score, 0);
        return res;

        
    }
}