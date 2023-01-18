class Solution {
    public static int kadane(int[] nums){
        int n = nums.length;
        int maxsum=Integer.MIN_VALUE,cursum=0;
        for(int i=0;i<n;i++){
            cursum+=nums[i];
            if(cursum>maxsum){
                maxsum=cursum;
            }
            if(cursum<0){
                cursum=0;
            }
        }
        return maxsum;
    }
    public int maxSubarraySumCircular(int[] nums) {
        int lsum = kadane(nums);
        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            nums[i]=-1*nums[i];
        }
        int rsum = kadane(nums);
        sum+=rsum;
        if(sum==0){
            return lsum;
        }
        return Math.max(lsum,sum);
    }
}