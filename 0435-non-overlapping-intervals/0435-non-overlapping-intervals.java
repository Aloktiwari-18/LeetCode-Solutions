class Solution {
    public int eraseOverlapIntervals(int[][] inte) {
        int n= inte.length;
        ArrayList<ArrayList<Integer>> res= new ArrayList<>();
        ArrayList<Integer> sub= new ArrayList<>();

        Arrays.sort(inte, (a, b) -> Integer.compare(a[0], b[0]));
        sub.add(inte[0][0]);
        sub.add(inte[0][1]);

        res.add(sub);

        for(int i=1;i<n;i++){
            ArrayList<Integer> prev= res.get(res.size()-1);
            // ArrayList<Integer> sub1= new ArrayList<>();
           
            int a1= inte[i][0];
            int a2= inte[i][1];


            int prevCurr1= prev.get(0);
            int prevCurr2= prev.get(1);

            if(prevCurr2>a1){
                prev.set(1, Math.min(prevCurr2,a2));
            }else{
            ArrayList<Integer> sub1= new ArrayList<>();
            sub1.add(a1);
            sub1.add(a2);
            res.add(sub1);

            }

        }
        return n- res.size();

        
    }
}