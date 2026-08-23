class Solution {
    public boolean solve(int [] mS, int idx, int side, int sum, int ans, boolean []used){
        if(ans==3){
            return true;
        }
        if(sum==side){
           return solve(mS, 0, side, 0, ans+1, used);
        }
        for(int i=idx;i<mS.length;i++){
            if(used[i]) continue;
            if(sum+mS[i]>side){
                continue;
            }

            sum+=mS[i];
            used[i]=true;
            if(solve(mS, i+1, side, sum, ans, used)){
                return true;
            }
            sum-=mS[i];
           
            used[i]=false;

        }
        return false;
    }
    public boolean makesquare(int[] mS) {
        int maxSum= 0;
        for(int ele: mS){
            maxSum+=ele;
        }
        if(maxSum%4!=0){
            return false;
        }
        int side= maxSum/4;
        int ans=0;
        boolean used[]= new boolean[mS.length];
       return solve(mS, 0, side, 0, 0, used);
        
        
    }
}