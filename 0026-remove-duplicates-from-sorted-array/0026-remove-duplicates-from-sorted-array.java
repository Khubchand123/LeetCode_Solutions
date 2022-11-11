class Solution {
    public int removeDuplicates(int[] nums) {
        int m=0,n=0;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]==nums[i+1]){
                n++;
            }
            else{
                nums[m]=nums[i];
                m++;
            }
        }
        nums[m]=nums[nums.length-1];
        return m+1;
    }
}