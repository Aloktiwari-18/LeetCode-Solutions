class Solution {
    public int minimumRecolors(String blocks, int k) {
        int n= blocks.length();
        int left=0;
        int min= Integer.MAX_VALUE;
        int count=0;
        for(int right=0;right<n;right++){
            char ch=blocks.charAt(right);
            if(ch=='W'){
                count++;
            }
            if(right-left+1==k){
                min=Math.min(min, count);
                if(blocks.charAt(left)=='W'){
                    count--;
                }
                left++;

            }
            
        }
        return min;
        
    }
}