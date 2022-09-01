class Solution {
    public int[] twoSum(int[] nums, int target) {
        int p=0,q=0;
        for(int i=0;i<nums.length-1;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]+nums[j]==target){// writer Khubchand Bansal
                    p=i;
                    q=j;
                    break;
                }
            }
            if(p!=0 && q!=0){
                break;
            }
            
        }
        int arr[]={p,q};
        return arr;
    }
}