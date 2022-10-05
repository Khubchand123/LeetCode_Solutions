class Solution {
    public int sumOfUnique(int[] nums) {
        Map<Integer,Integer> map = new HashMap<>();
        int sum=0;
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
                if(map.get(nums[i])==1){
                    sum-=nums[i];
                    map.put(nums[i],0);
                }
                
            }
            else{
                map.put(nums[i],1);
                sum+=nums[i];
            }
        }
        return sum;
        
    }
}