class Solution {
    public int search(int[] nums, int target) {
        int right = nums.length-1;
        int left=0;
        int mid = (left+right)/2;
        while(left<=right){
            if(nums[mid]==target){
                return mid;
            }
            else if(nums[mid]<target){
                left++;
            }
            else{
                right--;
            }
            mid=(left+right)/2;
        }
        return -1;
    }
}