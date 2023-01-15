class Solution {
    public int[] twoSum(int[] nums, int target) {
        int ans[] = new int[2];
        int l=0;
        int r=nums.length-1;
        while(l<r){
            int k = nums[l]+nums[r];
            if(k==target){
                break;
            }
            else if(k>target){
                r--;
            }
            else{
                l++;
            }
        }
        ans[0]=l+1;
        ans[1]=r+1;
        return ans;
    }
}