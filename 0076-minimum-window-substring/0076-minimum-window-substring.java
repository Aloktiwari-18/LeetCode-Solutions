class Solution {
    public String minWindow(String s, String t) {
        int n=s.length();
        int m= t.length();
        int left=0;
        int right=0;
        int idx=0;
        int arr[]= new int[128];
        int min= Integer.MAX_VALUE;
        int cnt=0;

        for(int i=0;i<m;i++){
            char ch= t.charAt(i);
            arr[ch]++;
        }
        while(right<n){
            char ch= s.charAt(right);
            if(arr[ch]>0){
                cnt++;
            }
            arr[ch]--;

            while(cnt==m){
                if(right-left+1<min){
                    min=right-left+1;
                    idx=left;
                }
                char c= s.charAt(left);
                arr[c]++;
                if(arr[c]>0){
                    cnt--;
                }
                left++;
                


            }
            right++;
        }
         if (min==Integer.MAX_VALUE) return "";
         return s.substring(idx, idx+min);

        
    }
}