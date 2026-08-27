class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set= new HashSet<>();
        HashSet<Integer> set1= new HashSet<>();

        for(int ele:nums1){
            set.add(ele);
        }
        for(int ele:nums2){
            set1.add(ele);
        }
        ArrayList<Integer> arr= new ArrayList<>();
        for(int ele:set1){
            if(set.contains(ele)){
                arr.add(ele);
            }
        }
        int ans[]= new int[arr.size()];
        int k=0;
        for(int i=0;i<arr.size();i++){
            ans[k++]= arr.get(i);
        }

return ans;
        
    }
}