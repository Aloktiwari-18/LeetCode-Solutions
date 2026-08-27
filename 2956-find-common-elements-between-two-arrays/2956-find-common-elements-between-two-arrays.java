class Solution {
    public int[] findIntersectionValues(int[] nums1, int[] nums2) {
        HashSet<Integer> set=new  HashSet<>();
        HashSet<Integer> set1=new  HashSet<>();
        for(int ele: nums1){
            set.add(ele);
        }
        for(int ele: nums2){
            set1.add(ele);
        }
        int ans=0;
        int ans1=0;
        for(int i=0;i<nums1.length;i++){
            if(set1.contains(nums1[i])){
                ans++;
            }
           
        }
        for(int i=0;i<nums2.length;i++){
            if(set.contains(nums2[i])){
                
                ans1++;
            }
        }
        return new int[]{ans, ans1};

        
    }
}