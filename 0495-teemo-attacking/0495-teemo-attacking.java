class Solution {
    public int findPoisonedDuration(int[] time, int duration) {
        int n=time.length;
        int tot=0;
        for(int i=0;i<n-1;i++){
            int gap= time[i+1]-time[i];

            tot+=Math.min(gap, duration);
        }
        tot+=duration;
        return tot;
        
    }
}