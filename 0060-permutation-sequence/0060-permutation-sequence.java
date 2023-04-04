class Solution {
    int c;
    String ans;
    public String getPermutation(int n, int k) {
        int[] nums = new int[n];
        for(int i=0;i<n;i++){
            nums[i]=i+1;
        }
        c=k;
        ans="";
        List<Integer> obj = new ArrayList<>();
        helper(nums,obj,new boolean[nums.length]);
        return ans;
    }
    void helper(int[] nums,List<Integer> obj,boolean[] visited){
        if(obj.size()==nums.length){
            c--;
            if(c==0){
                for(int i:obj){
                    ans+=i;
                }
            }
            return;
        }
        for(int i=0;i<nums.length;i++){
            if(visited[i]){
                continue;
            }
            obj.add(nums[i]);
            visited[i]=true;
            helper(nums,obj,visited);
            obj.remove(obj.size()-1);
            visited[i]=false;
        }
    }
}