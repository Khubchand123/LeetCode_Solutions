class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        Map<Integer,Integer> map = new HashMap<>();
        long max=0;
        long sum=0;
        for(int i=0;i<k;i++){
            sum+=(long)nums[i];
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        if(map.size()==k){
            max=sum;
        }
        for(int i=k;i<nums.length;i++){
            sum-=(long)nums[i-k];
            sum+=(long)nums[i];
            map.put(nums[i-k],map.get(nums[i-k])-1);
            if(map.get(nums[i-k])==0){
                map.remove(nums[i-k]);
            }
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
            if(map.size()==k) max=max>sum?max:sum;
        }
        return max;
    }
   
}