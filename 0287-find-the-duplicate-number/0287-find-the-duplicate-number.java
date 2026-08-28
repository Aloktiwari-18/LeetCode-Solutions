class Solution {
    public int findDuplicate(int[] nums) {
    HashSet<Integer> set= new HashSet<>();
    int ans=-1;
    for(int ele: nums){
        if(set.contains(ele)){
            ans= ele;
            break;
        }
        set.add(ele);
    }
    return ans;

    }
}