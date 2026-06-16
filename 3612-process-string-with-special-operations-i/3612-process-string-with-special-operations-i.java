class Solution {
    public String processStr(String s) {
        StringBuilder sb= new StringBuilder ();
        for(int i=0;i<s.length();i++){
            char ch= s.charAt(i);
            

            
            if(ch=='*'&& sb.length()>0){
                sb.deleteCharAt(sb.length()-1);
            }
             if(ch=='#'){
                
                
                sb.append(sb);
            }
           if(ch=='%'){
                sb.reverse();
            }
            if(ch>='a' && ch <='z'){
                
                sb.append(ch);
            }

            
 

        }
        return sb.toString();
    }
}