class Solution {
    public static void reverse(List<Integer> list, int left, int right){
        while(left<right){
            int temp= list.get(left);
            list.set(left, list.get(right));
            list.set(right, temp);
            left++;
            right--;
        }
        
    }
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        int n= grid.length;
        int m= grid[0].length;
        List<Integer> list= new ArrayList<>();
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                list.add(grid[i][j]);
            }
        }
        int size= list.size();
        k%=size;

        reverse(list, 0, size-1);
        reverse(list, 0,k-1);
        reverse(list,k, size-1 );
        int idx=0;
        List<List<Integer>> ans= new ArrayList<>();
        for(int i=0;i<n;i++){
            List<Integer> subAns= new ArrayList<>();
            for(int j=0;j<m;j++){
                subAns.add(list.get(idx++));
            }
            ans.add(subAns);
        }
        return ans;

        
    }
}