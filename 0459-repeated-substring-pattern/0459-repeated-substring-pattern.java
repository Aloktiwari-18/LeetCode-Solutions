class Solution {
    public boolean repeatedSubstringPattern(String s) {
        String dob= s+s;
        String sub= dob.substring(1, dob.length()-1);
        return sub.contains(s);
        
    }
}