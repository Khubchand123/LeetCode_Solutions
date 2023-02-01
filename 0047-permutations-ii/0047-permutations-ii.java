class Solution {
    static void permu(int[] nums,List<List<Integer>> ans,List<Integer> obj,int idx){
    if(obj.size()==nums.length){
        if(!ans.contains(obj)){
            ans.add(new ArrayList<>(obj));
        }
        
        return;
    }
    int size = obj.size();
    for(int i=0;i<=size;i++){
        List<Integer> temp = new ArrayList<Integer>(obj); 
        temp.add(i,nums[idx]);
        permu(nums,ans,temp,idx+1);
    }
   }
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> obj = new ArrayList<>();
        permu(nums,ans,obj,0);
        return ans;
    }
}