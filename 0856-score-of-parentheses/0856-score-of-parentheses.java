class Solution {
    public int scoreOfParentheses(String s) {
        
        int max=0;
        int count=0;
        for(int i=0;i<s.length();i++){
            char c= s.charAt(i);
            if(c=='('){
                count++;
               
            }else{
                count--;
                if(s.charAt(i-1)=='('){
                    max+=1<<count;
                }
            }
        }
return max;
    }
}