class Solution {
     int cnt=0;
    public void helper(int num1, int num2){
        if(num1>num2){
            return ;
        }
        String s= String.valueOf(num1);
        for(int i=1;i<s.length()-1;i++){
           if(s.charAt(i)>s.charAt(i-1) && s.charAt(i)>s.charAt(i+1) 
                 || s.charAt(i)<s.charAt(i-1) && s.charAt(i)<s.charAt(i+1)){
                     cnt++;
                 }
        }
        helper(num1+1, num2);
    }
    public int totalWaviness(int num1, int num2) {
    //     int cnt=0;
    //    for(int x=num1; x<=num2;x++){
    //         String s= String.valueOf(x);
    //         for(int i=1;i<s.length()-1;i++){
    //             if(s.charAt(i)>s.charAt(i-1) && s.charAt(i)>s.charAt(i+1) 
    //             || s.charAt(i)<s.charAt(i-1) && s.charAt(i)<s.charAt(i+1)){
    //                 cnt++;
    //             }

    //         }
    //    }
    //    return cnt;
   

     helper(num1, num2);
     return cnt;
        
    }
}