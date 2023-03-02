class Solution {
    public void moveZeroes(int[] nums) {
        int i=0;
        int j=0;
        for(int k=0;k<nums.length;k++){
            if(nums[k]!=0){
                if(i!=k){
                    nums[i] = nums[k];
                    nums[k]=0;
                    i++;
                    while(nums[i]!=0){
                        i++;
                    }
                }
                else{
                    i++;
                }
            }
        }
    }
}