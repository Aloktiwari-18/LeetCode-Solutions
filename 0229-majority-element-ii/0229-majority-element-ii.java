class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int cand1=0;
        int count1=0;
        int cand2=0;
        int count2=0;
        int n=nums.length;

        for(int ele:nums){
            if(count1==0 && cand2!=ele){
                cand1=ele;
                count1++;
            }
            else if(count2==0 && cand1!=ele){
                cand2=ele;
                count2++;
            }
            else if(ele==cand1){
                count1++;
            }
            else if(ele==cand2){
                count2++;
            }
            else{
                count1--;
                count2--;
            }

        }
        List<Integer> ans= new ArrayList<>();
        int k1=0;
        int k2=0;
        for(int ele:nums){
            if(ele==cand1){
                k1++;
            }
            if(ele==cand2){
                k2++;
            }
        }
        if(k1>n/3){
            ans.add(cand1);

        }
        if(k2>n/3){
           if(cand1!=cand2) ans.add(cand2);
        }

        return ans;
        
    }
}