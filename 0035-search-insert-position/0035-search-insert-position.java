class Solution {
    public int searchInsert(int[] nums, int target) {
        
        if(target<=nums[0]) return 0;
        if(target>nums[nums.length-1]){
            return nums.length;
        }
        
        int left=0;
        int right=nums.length-1;
        int mid=(left+right)/2;
        int t=-1;
        while(left<right){
            if(nums[mid]==target){
                t=mid;
                break;
            }
            else if(target<nums[mid]){
                right=mid;
            }
            else{
                left=mid;
            }
            mid=(left+right)/2;
            if(mid==left || mid==right){
                break;
            }
        }
        if(t==-1){
            return mid+1;
        }
        return t;
    }
}