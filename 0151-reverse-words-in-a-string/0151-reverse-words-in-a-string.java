class Solution {
    public String reverseWords(String s) {
        String arr[]=s.split("\\s+") ;// Split on the basis of space

        StringBuilder sb=new StringBuilder("");
        for(int i=arr.length-1;i>=0;i--){
            sb.append(arr[i]+" ");
        }
        // trim function---> remove and trailing space 
        String ans=sb.toString();
        ans=ans.trim();
        return ans;
        
    }
}