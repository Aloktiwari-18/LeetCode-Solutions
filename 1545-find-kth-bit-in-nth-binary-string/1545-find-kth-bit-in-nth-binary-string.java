class Solution {
    public static String solver(int n, int k,  StringBuilder S1){
        
        for(int i=1;i<n;i++){
            String prev= S1.toString();
            StringBuilder temp= new StringBuilder();
            temp.append(prev);
            temp.append("1");
            temp.append(reverse(invert(prev)));
           
            S1=temp;
            
        }
        return S1.toString();

    }
    public static String reverse(String s1){
        StringBuilder sb= new StringBuilder();
        for(int i=0;i<s1.length();i++){
            sb.append(s1.charAt(i));
        }
        sb.reverse();
        return sb.toString();

    }
    public static String invert(String s){
        StringBuilder sb= new StringBuilder();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='1'){
                sb.append('0');

            }else{
                sb.append('1');
            }
        }
        return sb.toString();

        
    }
    public char findKthBit(int n, int k) {
        
       
       
       String S1= solver(n, k,new StringBuilder("0"));
        
        char ch= S1.charAt(k-1);
        return ch;
        
        
        
    }
}