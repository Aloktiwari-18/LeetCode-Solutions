class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        HashMap<Character,Integer> map= new HashMap<>();
        for(char ch: p.toCharArray()){
            map.put(ch, map.getOrDefault(ch, 0)+1);
        } 

        HashMap<Character, Integer> map1= new HashMap<>();
        int left=0;
        int right=0;
        List<Integer> ans= new ArrayList<>();
        while(right<s.length()){
            char ch= s.charAt(right);
            map1.put(ch, map1.getOrDefault(ch, 0)+1);
            if(right-left+1==p.length()){
                if(map1.equals(map)){
                ans.add(left);
            }
            
                map1.put(s.charAt(left), map1.get(s.charAt(left))-1);
                if(map1.get(s.charAt(left))==0){
                    map1.remove(s.charAt(left));
                }
                left++;

            }
            right++;
        }
        return ans;
        
    }
}