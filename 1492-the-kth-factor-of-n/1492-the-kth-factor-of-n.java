class Solution {
    public int kthFactor(int n, int k) {
        int count=0;
        int num=0;
        for(int i=1;i<=n;i++){
            num=i;

            if(n%i==0){
                count++;
                if(count==k) break;
                
            }
            
        }
        if(count<k) return -1;
        return num;
        
    }
}