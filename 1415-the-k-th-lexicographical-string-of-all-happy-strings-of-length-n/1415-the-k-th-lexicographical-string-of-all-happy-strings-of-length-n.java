class Solution {
    List<String> list= new ArrayList<>();
    String x="abc";
    public void helper(int n, StringBuilder sb){
    if(sb.length()==n){
            list.add(sb.toString());
            return ;
        }
        for(int i=0;i<3;i++){
            char ch=x.charAt(i);
            if(sb.length()>0 && ch==sb.charAt(sb.length()-1)){
                continue;
            }
            sb.append(ch);
            helper(n,sb);
            sb.deleteCharAt(sb.length()-1);
        }
        

    }
    public String getHappyString(int n, int k) {
        

        helper(n, new StringBuilder());
       if(list.size()<k){
        return "";
       }else{
       return list.get(k-1);
       }
        
    }
}