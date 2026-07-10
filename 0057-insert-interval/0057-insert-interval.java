class Solution {
    public int[][] insert(int[][] inte, int[] newinte) {
        int n= inte.length;
        int i=0;
        List<int[]> res= new ArrayList<>();
        while(i<n && inte[i][1]<newinte[0]){
            res.add(inte[i++]);
        }

        while(i<n && inte[i][0]<=newinte[1]){
            newinte[1]= Math.max(inte[i][1], newinte[1]);
            newinte[0]= Math.min(inte[i][0], newinte[0]);
        i++;
        }
        res.add(newinte);

        while(i<n){
            res.add(inte[i++]);
        }
        return res.toArray(new int[0][]);
        
    }
}