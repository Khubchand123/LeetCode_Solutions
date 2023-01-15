class Solution {
    public void moveZeroes(int[] nums) {
        int n = nums.length;
        int c=0;
        for(int i:nums){
            if(i==0){
                c++;
            }
        }
        int k=0;
        for(int i:nums){
            if(i!=0){
                nums[k++]=i;
            }
        }
        while(k<n){
            nums[k++]=0;
        }
    }
}