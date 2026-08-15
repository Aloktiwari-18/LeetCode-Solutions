class Solution {
    public int numberOfSubstrings(String s) {
        int left=0;
        int right=0;
        int n=s.length();
        int count=0;
        HashMap<Character, Integer> map= new HashMap<>();

        while(right<n){
            char ch= s.charAt(right);
                map.put(ch, map.getOrDefault(ch,0)+1);
                while(map.size()==3){
                    count+=n-right;
                    char c=s.charAt(left);
                    map.put(c, map.get(c)-1);
                    if(map.get(s.charAt(left))==0){
                        map.remove(s.charAt(left));

                    }
                    left++;

                }
               

                
                right++;

        }
       return count;
        
    }
}