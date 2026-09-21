class Solution {

    public int solve(int [] days, int costs[], int idx, int max, int []dp){
        if(idx>=days.length){
            return 0;
        }
        if(dp[idx]!=-1){
            return dp[idx];
        }
        int dayOne= costs[0] + solve(days, costs, idx+1,  max, dp);
        int next=idx;
        while(next<days.length && days[next]<days[idx]+7){
            next++;
        }
        int seven= costs[1]+solve(days, costs, next, max, dp);
        next=idx;
        while(next<days.length && days[next]<days[idx]+30){
            next++;
        }
        int thirty= costs[2]+ solve(days, costs, next ,max, dp);
        return dp[idx]= Math.min(dayOne, Math.min(seven, thirty));
    }
    public int mincostTickets(int[] days, int[] costs) {
        int dp[]= new int[days.length+1];
        
            Arrays.fill(dp,-1);
        
        int max= days[days.length-1];
        return solve(days, costs, 0, max, dp);
        
    }
}