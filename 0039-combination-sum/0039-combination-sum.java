class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> obj = new ArrayList<>();
        helper(ans,obj,candidates,target,0,0);
        return ans;
    }
    void helper(List<List<Integer>> ans,List<Integer> obj,int[] arr,int target,int sum,int idx){
        if(sum==target){
            ans.add(new ArrayList<>(obj));
        }
        if(sum>target){
            return;
        }
        for(int i=idx;i<arr.length;i++){
            obj.add(arr[i]);
            helper(ans,obj,arr,target,sum+arr[i],i);
            obj.remove(obj.size()-1);
        }
    }
}