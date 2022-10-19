class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> ans= new ArrayList<>();
        Arrays.sort(candidates);
        List<Integer> obj = new ArrayList<>();
        Comb(candidates,ans,obj,0,target,0);
        return ans;
    }
    public static void Comb(int[] candidates,List<List<Integer>> ans,List<Integer> obj,int sum,int target,int idx){
        if(sum==target){
            ans.add(new ArrayList<>(obj));
            return;
        }
        if(sum>target){
            return;
        }
        for(int i=idx;i<candidates.length;i++){
            if(i!=idx  && candidates[i]==candidates[i-1]){
                continue;
            }else{
            sum+=candidates[i];
            obj.add(candidates[i]);
            Comb(candidates,ans,obj,sum,target,i+1);
            sum-=candidates[i];
            obj.remove(obj.size()-1);
            }
        }
    }
}