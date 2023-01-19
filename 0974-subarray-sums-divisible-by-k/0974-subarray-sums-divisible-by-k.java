class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        int sum=0;
        int[] freq=new int[k];
        freq[0]=1;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            sum=sum%k;
            if(sum<0){
                sum=sum+k;
            }
            freq[sum]+=1;
        }
        int ans=0;
        for(int i=0;i<freq.length;i++){
            ans=ans+((freq[i]*(freq[i]-1))/2); 
        }
        return ans;
    }
}