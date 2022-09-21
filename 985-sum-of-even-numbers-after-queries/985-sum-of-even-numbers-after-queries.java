class Solution {
    public int[] sumEvenAfterQueries(int[] nums, int[][] queries) {
        int arr[]=new int[queries.length];
        int sum=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]%2==0){
                sum+=nums[i];
            }
        }
        for(int i=0;i<queries.length;i++){
            if(nums[queries[i][1]]%2==0){
                if(queries[i][0]%2==0){
                    sum+=queries[i][0];
                }
                else{
                    sum-=nums[queries[i][1]];
                }
            }
            else{
                if(queries[i][0]%2==0){
                
                }
                else{
                    sum+=nums[queries[i][1]]+queries[i][0];
                }
            }
            nums[queries[i][1]]+=queries[i][0];
            arr[i]=sum;
            
        }
        return arr;
    }
}