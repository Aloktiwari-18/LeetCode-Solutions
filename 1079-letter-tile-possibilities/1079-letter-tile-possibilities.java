class Solution {
    int count;
    public void solve(char[] chars, int idx, boolean [] used){
        if(idx==chars.length){
            return;
        }
        for(int i=0;i<chars.length;i++){
            if(used[i]) continue;
            if(i-1>=0 && chars[i]== chars[i-1] && !used[i-1
            ]) continue;
            used[i]=true;
            count++;
            solve(chars, idx+1, used);
            used[i]= false;
        }
    }
    public int numTilePossibilities(String tiles) {
        count=0;
        char chars[]= tiles.toCharArray();
        Arrays.sort(chars);
        boolean [] used= new boolean[chars.length];


        solve(chars, 0, used);
        return count;
    }
}