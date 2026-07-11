class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int n=nums1.length;
        int m= nums2.length;
        // ArrayList<Integer> res= new ArrayList<>
        int res[]= new int[n];
        // Stack<Integer> st= new Stack<>();
       
        for(int i=0;i<n;i++){
            int j=0;
            while(j<m && nums1[i]!=nums2[j]){
                j++;
            }
            int ans=-1;
            for(int k=j+1 ;k<m;k++){
                if(nums2[k]>nums1[i]){
                   ans=nums2[k];
                    break;
                }
            }
            res[i]=ans;
            
        }
        return res;



        
    }
}