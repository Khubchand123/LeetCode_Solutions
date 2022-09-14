class Solution {
    public int majorityElement(int[] nums) {
        int count=1;
        int majorityE=nums[0];
        for(int i=1;i<nums.length;i++){
            if(majorityE==nums[i]){
                count++;
            }
            else{
                count--;
                if(count==0){
                    count=1;
                    majorityE=nums[i];
                }
            }
        }
        return majorityE;
    }
}