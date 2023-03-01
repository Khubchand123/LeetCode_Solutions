class Solution {
    public int[] sortArray(int[] nums) {
        mergeSort(nums,0,nums.length-1);
        return nums;
    }
    void mergeSort(int[] nums,int l,int r){
        if(l<r){
            int mid = (l+r)/2;
            mergeSort(nums,l,mid);
            mergeSort(nums,mid+1,r);
            merge(nums,l,mid,r);
        }
    }
    void merge(int[] nums,int low,int mid,int high){
        int n = high-low+1;
        int left=low;
        int right = mid+1;
        int arr[] = new int[n];
        int idx = 0;
        while(left<=mid && right<=high){
            if(nums[left]<nums[right]){
                arr[idx++] = nums[left++];
            }
            else{
                arr[idx++] = nums[right++];
            }
        }
        while(left<=mid){
            arr[idx++] = nums[left++];
        }
        while(right<=high){
            arr[idx++] = nums[right++];
        }
        for(int i=0;i<n;i++){
            nums[low+i] = arr[i];
        }
    }
}