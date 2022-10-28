class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> ans = new ArrayList<>();
        comb(ans,new ArrayList<>(),n,k,1);
        return ans;
    }
    static void comb(List<List<Integer>> ans, List<Integer> obj,int n,int k,int idx){
        if(obj.size()==k){
            ans.add(new ArrayList<>(obj));
            return;
        }
        for(int i=idx;i<=n;i++){
            obj.add(i);
            comb(ans,obj,n,k,i+1);
            obj.remove(obj.size()-1);
        }
    }
}