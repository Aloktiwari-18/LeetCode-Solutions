class Solution {
    public String replaceWords(List<String> dict, String sent) {

        StringBuilder sb= new StringBuilder();
        HashSet<String> set= new HashSet<>();
        for(String w:dict){
            set.add(w);
        }

        for(String s:sent.split(" ")){
            String t=s;
            for(int i=1;i<=s.length();i++){
                String w= s.substring(0,i);

                if(set.contains(w)){
                    t= w;
                    break;
                }
            }
            sb.append(t).append(" ");
        }
        sb.deleteCharAt(sb.length()-1);
        return sb.toString();

       
    
        
        
    }
}