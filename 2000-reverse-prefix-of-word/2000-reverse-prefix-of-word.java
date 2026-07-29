class Solution {
    public String reversePrefix(String word, char ch) {
        int k=0;
        for(int i=0;i<word.length();i++){
            char c=word.charAt(i);
            if(c==ch){
                k=i;
                break;
            }else{
                continue;
            }

        }
        String left= word.substring(0,k+1);
        String right=word.substring(k+1, word.length());

        StringBuilder sb= new StringBuilder(left);
        String l= sb.reverse().toString();
        return l+right;
        
    }
}