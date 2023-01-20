class Solution {
    static Set<List<Integer>> set;
    public List<List<Integer>> findSubsequences(int[] nums) {
        set = new HashSet<>();
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> obj = new ArrayList<>();
        helper(ans,obj,nums,0);
        return ans;
    }
    public static void helper(List<List<Integer>> ans,List<Integer> obj,int[] nums,int idx){
        if(obj.size()>=2){
            if(!set.contains(obj)){
                ans.add(new ArrayList<>(obj));
                set.add(new ArrayList<>(obj));
            }
        }
        for(int i=idx;i<nums.length;i++){
            if(obj.size()==0 || obj.get(obj.size()-1)<=nums[i]){
            obj.add(nums[i]);
            helper(ans,obj,nums,i+1);
            obj.remove(obj.size()-1);
            }
        }
    }
}