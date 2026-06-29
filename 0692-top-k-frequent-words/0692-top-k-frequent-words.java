class Pair{
    int count;
    String word;
    Pair(int count, String word){
        
        this.count= count;
        this.word= word;
        
    }
}

class Solution {

    public List<String> topKFrequent(String[] words, int k) {
        ArrayList<String> res= new ArrayList<>();

        PriorityQueue<Pair> pq= new PriorityQueue<>((a,b)->{
            if(a.count==b.count)
                return a.word.compareTo(b.word);
            return b.count- a.count;
        });

        HashMap<String ,Integer> map= new HashMap<>();
        for(String s: words){
            map.put(s, map.getOrDefault(s, 0)+1);
        }

        for(String s:map.keySet()){
            pq.add(new Pair(map.get(s), s));
        }
        while(k--> 0){
            res.add(pq.poll().word);
            

        }
        return res;
        

        
        
    }
}