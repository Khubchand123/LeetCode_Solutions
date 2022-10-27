class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        int arr[] = new int[1001];
        for(int i:nums1){
            if(arr[i]!=1){
                arr[i]++;
            }
        }
        int count=0;
        for(int i:nums2){
            if(arr[i]==1){
                arr[i]++;
                count++;
            }
        }
        int ans[] = new int[count];
        int idx=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==2){
                ans[idx++]=i;
            }
        }
        return ans;
        
    }
}