class Solution {
    public boolean isValid(String word) {
        int n=word.length();
        if(n<3){
            return false;
        }
        boolean hasVowel=false;
        boolean hasConsonent=false;

        for(int i=0;i<n;i++){
            char ch=word.charAt(i);
            if(!Character.isLetterOrDigit(ch)){
                return false;
            }
            if ("AEIOUaeiou".indexOf(ch) != -1) {
            hasVowel = true;
        }
        else if (Character.isLetter(ch)) {
            hasConsonent = true;
        }
        }
        return hasVowel && hasConsonent;
        
    }
}