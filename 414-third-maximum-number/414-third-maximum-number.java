class Solution {
    public int thirdMax(int[] nums) {
        int n = nums.length;
        int max1=Integer.MIN_VALUE;
        int max2=Integer.MIN_VALUE;
        int max3=Integer.MIN_VALUE;
        int c3=0;
        for(int i=0;i<n;i++){
            if(max1<=nums[i]){
                max1=nums[i];
            }
        }
        for(int i=0;i<n;i++){
            if(max2<nums[i] && nums[i]!=max1){
                max2=nums[i];
            }
        }
        for(int i=0;i<n;i++){
            if(max3<=nums[i] && nums[i]!=max2 && nums[i]!=max1){
                max3=nums[i];
                if(nums[i]==Integer.MIN_VALUE){
                    c3=1;
                }
                else{
                    c3=0;
                }
            }
        }
        if(c3==1){
            return max3;
        }
        return max3!=Integer.MIN_VALUE?max3:max1;
        
    }
}