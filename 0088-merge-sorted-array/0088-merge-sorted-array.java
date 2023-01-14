class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        if(m==0){
            for(int i=0;i<n;i++){
                nums1[i] = nums2[i];
            }
            return;
        }
        int l = n+m-1;
        n--;
        m--;
        while(n>=0 && m>=0){
            if(nums2[n]>nums1[m]){
                nums1[l--]=nums2[n];
                n--;
            }
            else{
                nums1[l--]=nums1[m];
                m--;
            }
        }
        while(n>=0){
            nums1[l--] = nums2[n--];
        }
    }
}