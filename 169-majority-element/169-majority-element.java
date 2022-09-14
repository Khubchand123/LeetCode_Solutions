class Solution {
    public int majorityElement(int[] nums) {
        int count=1;
        int me=nums[0];
        for(int i=1;i<nums.length;i++){
            if(me==nums[i]){
                count++;
            }
            else{
                count--;
                if(count==0){
                    count=1;
                    me=nums[i];
                }
            }
        }
        return me;
    }
}