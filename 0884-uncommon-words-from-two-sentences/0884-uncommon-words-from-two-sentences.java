class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {
        String st1[]= s1.split(" ");
        String st2[]= s2.split(" ");

        HashMap<String, Integer>  map1= new HashMap<>();
        HashMap<String, Integer>  map2= new HashMap<>();



        for(String ele:st1){
            map1.put(ele, map1.getOrDefault(ele,0)+1);
        }
        for(String ele:st2){
            map2.put(ele, map2.getOrDefault(ele,0)+1);
        }

        ArrayList<String> ans= new ArrayList<>();
        for(String ele:st1){
            if(!map2.containsKey(ele) && map1.get(ele)==1){
                ans.add(ele);
            }
        }
        for(String ele:st2){
            if(!map1.containsKey(ele) && map2.get(ele)==1){
                ans.add(ele);
            }
        }

       String res[]= new String[ans.size()];
       res=ans.toArray(res);
       return res;
        
    }
}