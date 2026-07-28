class Solution {
    public int maxFreqSum(String s) {
        HashMap<Character,Integer> vow= new HashMap<>();
        HashMap<Character,Integer> con= new HashMap<>();
        for(int i=0;i<s.length();i++){
            char ch= s.charAt(i);
            if(ch=='a'|| ch== 'e' || ch=='i' || ch=='o' || ch=='u'){
                    vow.put(ch, vow.getOrDefault(ch,0)+1);
            }else{
                 con.put(ch, con.getOrDefault(ch,0)+1);
            }
        }
        int max1=0;
        int max2=0;
        for(Map.Entry<Character, Integer> entry: vow.entrySet()){
            max1=Math.max(max1, entry.getValue());
        }
        for(Map.Entry<Character, Integer> entry : con.entrySet()){
            max2=Math.max(max2, entry.getValue());
        }
            return max1+max2;

    }
}