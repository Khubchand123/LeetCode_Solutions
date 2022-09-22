class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int n1=nums1.length;
        int n2=nums2.length;
        int arr[] = new int[n1];
        for(int i=0;i<nums1.length;i++){
            int p=-1;
            for(int j=0;j<nums2.length;j++){
                while((j<n2) && (nums2[j]!=nums1[i])){
                    j++;
                }
                while(j<n2) {
                    if(nums2[j]>nums1[i]){
                        p=nums2[j];
                        break;
                    }
                    j++;
                        
                }
            }
            arr[i]=p;
        }
        return arr;
    }
}