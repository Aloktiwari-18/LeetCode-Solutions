class Solution {
    public static int[] findRange(int bloomDay[]){
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        for(int val:bloomDay){
            min=Math.min(min,val);
            max=Math.max(max,val);
        }
        return new int[] {min,max};

    }
    public static boolean isPossible(int minDay,int m,int k,int [] bloomDay){
        int count=0;
        int total=0;
        for(int i=0;i<bloomDay.length;i++){
            if (bloomDay[i]<=minDay){
                count++;    
            }else{
                count=0;
            }
            if(count==k){
                total++;
                count=0;
            }
            if(total>=m){
                return true;
            }
        }
        return false;
    }


    public int minDays(int[] bloomDay, int m, int k) {
        if(bloomDay.length<m*k){
            return -1;
        }
        int[]range=findRange(bloomDay);
        int start=range[0];
        int end=range[1];
        int ans=-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(isPossible(mid,m,k,bloomDay)){
                  ans=mid;
                  end=mid-1;
            }else{
                start=mid+1;
            }
        }
        return ans;


        
        
    }
}