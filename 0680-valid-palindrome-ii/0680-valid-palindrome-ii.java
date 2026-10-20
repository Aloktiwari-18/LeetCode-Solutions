class Solution {
    public boolean isSol(String sb, int left, int right){
        
        while(left<right){
            if(sb.charAt(left)!=sb.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
    
    public boolean validPalindrome(String s) {
        
        int left=0;
        int right=s.length()-1;
        while(left<right){
            if(s.charAt(left)!=s.charAt(right)){
                return isSol(s,left+1, right) ||
                isSol(s,left, right-1);
            }
            left++;
            right--;
        }
        return true;
        
    }
}