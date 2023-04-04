class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> obj = new ArrayList<>();
        helper(nums,ans,obj,new boolean[nums.length]);
        return ans;
    }
    void helper(int[] nums,List<List<Integer>> ans,List<Integer> obj,boolean[] visited){
        if(obj.size()==nums.length){
            ans.add(new ArrayList<>(obj));
            return;
        }
        for(int i=0;i<nums.length;i++){
            if(visited[i]){
                continue;
            }
            obj.add(nums[i]);
            visited[i]=true;
            helper(nums,ans,obj,visited);
            obj.remove(obj.size()-1);
            visited[i]=false;
        }
    }
}