class Solution {
    public int myAtoi(String s) {
        int i=0;
        int n=s.length();
        while(i<n && s.charAt(i)==' '){
            i++;
        }
        boolean negative=false;
        if(i<n && (s.charAt(i)=='-' || s.charAt(i)=='+')){
            if(s.charAt(i)=='-') negative =true;
            i++;
        }
        int result=0;
        while(i<n){
            char c=s.charAt(i);

            if (c < '0' || c > '9') break;

            int digit=c-'0';
            if (result > (Integer.MAX_VALUE - digit) / 10) {
                return negative ? Integer.MIN_VALUE : Integer.MAX_VALUE;
            }

            result=result*10+digit;

            
            i++;

        }
        return negative? -result: result;



        
    }
}