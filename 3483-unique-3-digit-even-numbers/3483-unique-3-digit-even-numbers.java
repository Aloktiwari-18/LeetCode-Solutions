class Solution {
    public static void solver(int [] digits, boolean [] used, HashSet<Integer> ans, int count, int num){
        if(count==3){
            if(num%2==0){
                ans.add(num);
            }
            return ;
        }
        for(int i=0;i<digits.length; i++){
            if(used[i]) continue;

            if(count==0 && digits[i]==0){
                continue;
            }
            used[i]= true;
            solver(digits, used, ans, count+1, num*10+digits[i]);
            used[i]= false;
        }

    }
    public int totalNumbers(int[] digits) {
        int n= digits.length;
        HashSet<Integer> ans= new HashSet<>();
        boolean used[]= new boolean[n];
        solver(digits, used, ans, 0, 0);
        return ans.size();
        
    }
}