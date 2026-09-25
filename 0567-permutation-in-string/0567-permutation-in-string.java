class Solution {
    public boolean checkInclusion(String s1, String s2) {
       if(s2.contains(s1)){
        return true;
       }
       Map<Character, Integer> map1= new HashMap<>();
       for(char ch: s1.toCharArray()){
            map1.put(ch, map1.getOrDefault(ch, 0)+1);
       }
       HashMap<Character, Integer> map2= new HashMap<>();
       int left=0;
       int right=0;
       while(right<s2.length()){
         char ch= s2.charAt(right);

         map2.put(ch, map2.getOrDefault(ch,0)+1);
         while(right-left+1>s1.length()){
            char c= s2.charAt(left);
            map2.put(c, map2.get(c)-1);
            if(map2.get(c)==0){
                map2.remove(c);
            }
            left++;
         }
         if(right-left+1==s1.length()){
            if(map1.equals(map2)){
                return true;
            }
         }
         right++;
        
       }
        return false;
    }
}