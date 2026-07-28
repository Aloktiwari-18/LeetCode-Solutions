class Solution {
    public String defangIPaddr(String add) {
        
        StringBuilder sb= new StringBuilder();
        for(int i=0;i<add.length();i++){
            if(add.charAt(i)=='.'){
                 sb.append("[.]");
            }else{
               sb.append(add.charAt(i));
            }
        }
        return sb.toString();
    }
}