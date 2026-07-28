class Solution {
    public int reverseDegree(String s) {
        int sum=0;
        for(int i=0;i<s.length();i++){
            int n= 26- Math.abs(s.charAt(i)-'a');
            
              n=n*(i+1);
               sum+=n;
        }
        return sum;
    }
}