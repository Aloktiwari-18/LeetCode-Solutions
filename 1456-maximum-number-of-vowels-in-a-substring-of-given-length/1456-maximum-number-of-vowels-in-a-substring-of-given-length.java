class Solution {
    public int maxVowels(String s, int k) {
        int left=0;
        int right=0;
        int max=0;
        int n=s.length();
        int count=0;
        while(right<n){
            char ch= s.charAt(right);
            if(ch=='a' || ch=='e'  || ch=='i' || ch=='o' || ch=='u'){
                count++;
            }
           
            if(right-left+1==k){
                max=Math.max(max, count);
                char lc=s.charAt(left);
                if(lc=='a' || lc=='e'  || lc=='i' || lc=='o' || lc=='u'){
                    count--;
                    
                }
                left++;
                
            }
            right++;
        }
        return max;
        
    }
}