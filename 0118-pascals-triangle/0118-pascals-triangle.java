class Solution {
    public List<List<Integer>> generate(int n) {
    List<List<Integer>> ans= new ArrayList<>();
    List<Integer> a1= new ArrayList<>();
    a1.add(1);
    ans.add(a1);
    if(n==1){
        return ans;
    }
    
    List<Integer> a2= new ArrayList<>();
    a2.add(1);
    a2.add(1);
    ans.add(a2);
    if(n==2) return ans;

    for(int i=2;i<n;i++){
        List<Integer> temp= new ArrayList<>();
        temp.add(1);
        for(int j=0;j<ans.get(i-1).size()-1;j++){
            temp.add(ans.get(i-1).get(j)+ans.get(i-1).get(j+1));
        }
        temp.add(1);
        ans.add(temp);


    }
    return ans;
   

    }
}