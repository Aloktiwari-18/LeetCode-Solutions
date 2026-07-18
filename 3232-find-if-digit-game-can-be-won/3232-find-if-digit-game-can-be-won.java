class Solution {
    public boolean canAliceWin(int[] nums) {
        
        int a1=0;
        int a2=0;
        int b1=0;
        int b2=0;

        for(int i=0;i<nums.length;i++){
            int num= nums[i];
            int count=0;
            while(num>0){
                num=num/10;
                count++;
            }
            if(count==1){
                a1+=nums[i];
                b1+=nums[i];
            }else{
                a2+=nums[i];
                b2+=nums[i];
            }
        }
        if((a1>b2)|| a2>b1){
            return true;
        }else{
            return false;
        }
    }
}