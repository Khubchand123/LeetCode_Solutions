class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> obj = new ArrayList<>();
        helper(ans,obj,nums,0);
        return ans;
    }
    void helper(List<List<Integer>> ans,List<Integer> obj,int[] nums,int idx){
        if(obj.size()==nums.length){
            ans.add(new ArrayList<>(obj));
            return;
        }
        int size = obj.size();
        for(int i=0;i<=obj.size();i++){
            List<Integer> temp = new ArrayList<>(obj);
            temp.add(i,nums[idx]);
            helper(ans,temp,nums,idx+1);
        }
    }
}