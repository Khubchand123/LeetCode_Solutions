class Solution {
    public int[] sortedSquares(int[] nums) {
        int l=0;
        int r=nums.length-1;
        int i=nums.length-1;
        int nums1[] = new int[nums.length];
        while(l<=r){
            int sq1 = nums[l]*nums[l];
            int sq2 = nums[r]*nums[r];
            if(sq1>sq2){
                nums1[i--] = sq1;
                l++;
            }
            else{
                nums1[i--] = sq2;
                r--;
            }
        }
        return nums1;
    }
}