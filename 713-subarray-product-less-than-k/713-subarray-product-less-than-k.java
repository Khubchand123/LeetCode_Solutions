class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int ans=0;
        int n=nums.length;
        int si=0;
        int ei=0;
        int p=1;
        // int arr[] = new int[]
        while(ei<n){
            p*=nums[ei];
            while(p>=k && si<=ei){
                p=p/nums[si];
                si++;
            }
            ans+=ei-si+1;
            ei++;
        }
        return ans;
    }
}