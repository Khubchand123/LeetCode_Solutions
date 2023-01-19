class Solution {
    public int subarraySum(int[] nums, int k) {
        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            nums[i]=sum;
        }
        int ans=0;
        sum=0;
        for(int i=0;i<nums.length;i++){
            int p = nums[i];
            if(p==k){
                ans++;
            }
            p-=k;
            for(int j=0;j<i;j++){
                if(p==nums[j]){
                    ans++;
                }
            }
        }
        return ans;
    }
}