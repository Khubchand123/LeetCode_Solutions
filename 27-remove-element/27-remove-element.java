class Solution {
    public int removeElement(int[] nums, int val) {
        
        int m=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==val){
                
            }
            else{
                nums[m]=nums[i];
                m++;
            }
        }
        return m;
    }
}