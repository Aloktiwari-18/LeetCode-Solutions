class Solution {
    public int balancedStringSplit(String s) {
        int count=0;
        int cR=0;
        int cL=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='R'){
                cR++;
            }
            if(ch=='L'){
                cL++;
            }
            if(cR==cL){
                count++;
                cR=0;
                cL=0;
            }
            
        }
        return count;
        
    }
}