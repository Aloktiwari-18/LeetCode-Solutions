class Solution {
    public void solve(int []digits, HashSet<Integer> set, boolean [] used, int idx, int count, int num){
        if(count==3){
            if(num %2==0){
                set.add(num);
            }
            return;
        }
        for(int i=0;i<digits.length;i++){
            if(used[i]) continue;
            if(count==0 && digits[i]==0){
                continue;
            }
            used[i]= true;
            solve(digits, set, used, i, count+1, num*10+digits[i]);
            used[i]= false;
        }
    }
    public int totalNumbers(int[] digits) {
        HashSet<Integer> set= new HashSet<>();
        boolean used[]= new boolean[digits.length];
        solve(digits, set,used, 0,0, 0);
        return set.size();
    }
}