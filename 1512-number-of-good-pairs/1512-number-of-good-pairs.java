class Solution {
    public int numIdenticalPairs(int[] nums) {
        int arr[] = new int[101];
        for(int i=0;i<nums.length;i++){
            arr[nums[i]]++;
        }
        int sum=0;
        for(int i=0;i<101;i++){
            if(arr[i]>1){
                sum+=(arr[i]*(arr[i]-1))/2;
            }
        }
        return sum;
    }
}
