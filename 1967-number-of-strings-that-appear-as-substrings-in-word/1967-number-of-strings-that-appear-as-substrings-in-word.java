class Solution {
    public int numOfStrings(String[] pat, String word) {
        
    ArrayList<String> res= new ArrayList<>();

    
    for(int i=0;i<word.length();i++){
        StringBuilder sb= new StringBuilder();
        for(int j=i;j<word.length();j++){
            sb.append(word.charAt(j));
            res.add(sb.toString());

        }

    }
    HashSet<String> map= new HashSet<>();
    for(String ele:res){
        map.add(ele);

    }
    int count=0;
    for(String ele: pat){
        if(map.contains(ele)){
            count++;
        }
    }
    return count;
        
    }
}