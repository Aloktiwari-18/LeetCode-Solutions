class Solution {
    public String convertDateToBinary(String date) {

        String st[]= date.split("-");
        
        int y=Integer.parseInt(st[0]);
        int m=Integer.parseInt(st[1]);
        int d=Integer.parseInt(st[2]);
        StringBuilder sb= new StringBuilder();
        sb.append(Integer.toBinaryString(y));
        sb.append("-");
        sb.append(Integer.toBinaryString(m));
        sb.append("-");
        sb.append(Integer.toBinaryString(d));

        return sb.toString();
        

    }
}