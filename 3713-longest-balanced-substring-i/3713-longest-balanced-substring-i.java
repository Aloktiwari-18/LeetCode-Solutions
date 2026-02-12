class Solution {
    public int longestBalanced(String s) {
       int n=s.length();
       int ans= 0;
       for(int i=0;i<n;i++){
        int distinct=0;
        int freq=0;

        HashMap<Character, Integer> map= new HashMap<>();

        for(int j=i;j<n;j++){
            char ch= s.charAt(j);
            

            map.put(ch,map.getOrDefault(ch, 0)+1);
            distinct=map.size();
            freq=Math.max(freq, map.get(ch));

            if(distinct*freq==j-i+1){
                ans= Math.max(ans, j-i+1);
            }
        }
       }
       return ans;

        
    }
}