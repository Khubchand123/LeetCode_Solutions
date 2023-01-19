class Solution {
    public int subarraySum(int[] nums, int k) {
        int sum=0;
        Map<Integer,Integer> map = new HashMap<>();
        int ans=0;
        
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            int p = sum;
            if(p==k){
                ans++;
            }
            p-=k;
            if(map.containsKey(p)){
                ans+=map.get(p);
            }
            map.put(sum,map.getOrDefault(sum,0)+1);
        }
        return ans;
    }
}