class Solution {
    public int numberOfSubstrings(String s) {
        int count=0;
        int n= s.length();
        int ans[]= new int[]{-1, -1, -1};
        for(int i=0;i<s.length();i++){
            ans[s.charAt(i)-'a']=i;

            if(ans[0]!=-1 && ans[1]!=-1 && ans[2]!=-1){
                int min= Math.min(ans[0], Math.min(ans[1], ans[2]));
                count+=(1+min);
            }
            

        }
        return count;
        
    }
}