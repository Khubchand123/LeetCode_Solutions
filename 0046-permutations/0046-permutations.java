class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> obj = new ArrayList<>();
        helper(nums,ans,obj,0);
        return ans;
    }
    void helper(int[] nums,List<List<Integer>> ans,List<Integer> obj,int idx){
        if(obj.size()==nums.length){
            ans.add(new ArrayList<>(obj));
            return;
        }
        int count = obj.size();
        for(int i=0;i<=count;i++){
            obj.add(i,nums[idx]);
            helper(nums,ans,obj,idx+1);
            obj.remove(i);
        }
    }
}