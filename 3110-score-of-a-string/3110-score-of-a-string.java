class Solution {
    public int scoreOfString(String s) {
        
        int len=s.length();
        int arr[]= new int[len+1];
        for(int i=0;i<s.length();i++){
            int n= s.charAt(i);
            arr[i]=s.charAt(i);
        }
        int sum=0;
        for(int i=0;i<arr.length-1;i++){
            System.out.print(arr[i]);
        }
        for(int i=0;i<arr.length-2;i++){
            int num1=arr[i];
            int num2=arr[i+1];
            sum+=Math.abs(num1-num2);
        }
        return sum;
        
    }
}