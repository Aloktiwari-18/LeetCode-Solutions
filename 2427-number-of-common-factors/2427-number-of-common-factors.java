class Solution {
    public int commonFactors(int a, int b) {
        int count=0;
        int min=0;
        if(a>b){
            min=a;
        }else{
            min=b;
        }
        for(int i=1;i<min+1;i++){
            if(a%i==0 && b%i==0){
                count++;
            }
        }
        return count;
        
    }
}