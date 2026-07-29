class Solution {
    public int mostWordsFound(String[] sent) {
        
        int max=0;
        for(int i=0;i<sent.length;i++){
            String s=sent[i];
            String a[]= s.split(" ");
            
            int len= a.length;
            max=Math.max(max, len);


        }
        return max;
        
    }
}