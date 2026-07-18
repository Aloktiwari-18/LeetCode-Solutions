class Solution {
    public int countEven(int num) {
        int count=0;
        for(int i=2;i<=num;i++){
            int n=0;
            int rem= 0; 
            int nu=i;           
            while(nu>0){
                rem=nu%10;    
                n+=rem;
                nu=nu/10;
            }
            if(n%2==0){
                count++;
            }
        }
        return count;    
    }
}