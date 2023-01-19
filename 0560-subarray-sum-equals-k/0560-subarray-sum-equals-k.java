class Solution {
    public int subarraySum(int[] nums, int k) {
        int sum=0;
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            nums[i]=sum;
        }
        int ans=0;
        for(int i=0;i<nums.length;i++){
            int p = nums[i];
            if(p==k){
                ans++;
            }
            p-=k;
            if(map.containsKey(p)){
                ans+=map.get(p);
            }
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        return ans;
    }
}