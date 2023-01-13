class Solution {
    public int maxSubArray(int[] nums) {
        int sum=0;
        int a=nums[0];
        int count=0;
        for(int i=0;i<nums.length;i++){
            if(sum<nums[i]){
                break;
            }
            else{
               if(a<nums[i]){
                   a=nums[i];
                   // count++;
               } 
            }
            count++;
        }
        if(count==nums.length){
            return a;
        }
        int cursum=0;
        int maxsum=0;
        for(int i:nums){
            cursum+=i;
            if(cursum<0){
                cursum=0;
            }
            maxsum=Math.max(cursum,maxsum);
        }
        return maxsum;
    }
}