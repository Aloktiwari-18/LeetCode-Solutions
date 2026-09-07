class Solution {
    public String minWindow(String s, String t) {
        HashMap<Character, Integer> map= new HashMap<>();
        int n= s.length();
        int m= t.length();
        int sIndex=-1;
        int min= Integer.MAX_VALUE;
        int left=0;
        int right=0;
        int count=0;
        for(int i=0;i<m;i++){
            char ch= t.charAt(i);
            map.put(ch, map.getOrDefault(ch,0)+1);
        }
        while(right<n){
            char ch = s.charAt(right);
            if(map.containsKey(ch) && map.get(ch)>0){
                count++;
            }
             if(map.containsKey(ch)){
                map.put(ch, map.get(ch)-1);
             }
           
            while(count==m){
                if(right-left+1<min){
                    min= right-left+1;
                    sIndex=left;

                }
                char c= s.charAt(left);
                 if(map.containsKey(c)){
                        map.put(c, map.get(c)+1);

                        if(map.get(c)>0){
                        count--;
                }
                 
            }  
            left++;  
        }
            right++;

        }
        if(sIndex==-1){
            return "";
        }else{
            return s.substring(sIndex, sIndex+min); 
        }

        
    }
}