class Solution {
    public int rob(int[] nums) {
        int n = nums.length;
        if(n==1){
            return nums[0];
        }
        if(n==2){
            return Math.max(nums[0],nums[1]);
        }
        int arr1[] = new int[n-1];
        int arr2[] = new int[n-1];
        for(int i=0;i<n;i++){
            if(i!=0){
                arr2[i-1] = nums[i];
            }
            if(i!=n-1){
                arr1[i] = nums[i];
            }
        }
        // return helper(nums);
        return Math.max(helper(arr1),helper(arr2));
    }
    int helper(int[] nums){
        int n = nums.length;
        int prev1 = nums[0];
        int prev2 = 0;
        
        for(int i=1;i<n;i++){
            int incl = prev2 + nums[i];
            int excl = prev1 + 0;
            int ans = Math.max(incl,excl);
            prev2 = prev1;
            prev1 = ans;
        }
        return prev1;
    }
}