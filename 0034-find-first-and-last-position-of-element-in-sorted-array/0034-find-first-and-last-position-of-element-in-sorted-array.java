class Solution {
    public int[] searchRange(int[] nums, int target) {
        int left=0;
        int right=nums.length;
        int mid=(left+right)/2;
        int k=-1;
        while(left<right){
            if(nums[mid]==target){
                k=mid;
                break;
            }
            else if(nums[mid]<target){
                left=mid;
            }
            else{
                right=mid;
            }
            if(mid==(left+right)/2){
                break;
            }
            mid=(left+right)/2;
        }
        int[] arr = new int[2];
             // if element not present
        if(k==-1){
            arr[0]=-1;
            arr[1]=-1;
        }
        else{
            int a=k-1;
                // check upto where at first index target present
            while(a>=0 && nums[a]==target){
                a--;
            }
            int b=k+1;
               // check upto where at last index target present
            while(b<nums.length && nums[b]==target){
                b++;
            }
            arr[0]=a+1;
            arr[1]=b-1;
        }
        return arr;
    }
}