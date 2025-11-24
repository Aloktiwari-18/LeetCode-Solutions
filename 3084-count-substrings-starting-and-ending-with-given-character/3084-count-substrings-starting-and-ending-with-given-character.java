class Solution {
    public long countSubstrings(String s, char c) {
        long  count =0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch==c){
                count++;
            }
        }
       long ans=   count*(count+1)/2;
       return ans;
        
    }
}