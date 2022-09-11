class Solution {
    public void sortColors(int[] nums) {
        int n=nums.length;
        int arr[]=new int[n];
        int count=0;
        for(int i=0;i<n;i++){
            if(nums[i]==0){
                arr[count++]=0;
            }
        }
        for(int i=0;i<n;i++){
            if(nums[i]==1){
                arr[count++]=1;
            }
        }
        for(int i=0;i<n;i++){
            if(nums[i]==2){
                arr[count++]=2;
            }
        }
        for(int i=0;i<n;i++){
            nums[i]=arr[i];
        }
    }
}